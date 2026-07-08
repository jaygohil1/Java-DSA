#!/usr/bin/env python3
import argparse
import datetime
import os
import re
import sys

# Folders to ignore so they don't clutter your progress tracking table
IGNORED_FOLDERS = {'.git', '.idea', 'scripts', 'out', '.gitignore'}

MARKERS = {
    "STRUCTURE": ("", ""),
    "PROGRESS": ("", ""),
}

def get_valid_topic_folders(root):
    """Scans root directory and retrieves all subdirectories not explicitly ignored."""
    folders = []
    for name in os.listdir(root):
        full_path = os.path.join(root, name)
        if os.path.isdir(full_path) and name not in IGNORED_FOLDERS:
            folders.append(name)
    return sorted(folders)

def has_java_files(path):
    """Returns True if the folder or any nested folders contain a .java file."""
    for _, _, files in os.walk(path):
        if any(f.endswith(".java") for f in files):
            return True
    return False

def last_modified(path):
    """Finds the most recent modification timestamp among all files inside a folder."""
    latest = None
    for dirpath, _, files in os.walk(path):
        for f in files:
            fp = os.path.join(dirpath, f)
            try:
                mtime = os.path.getmtime(fp)
            except OSError:
                continue
            if latest is None or mtime > latest:
                latest = mtime
    if latest is None:
        return "—"
    return datetime.datetime.fromtimestamp(latest).strftime("%Y-%m-%d")

def format_title(folder_name):
    """Converts rough folder names like 'Meth_ods' or 'binary_search' into clean titles."""
    clean = folder_name.replace("_", " ").replace("-", " ")
    return clean.title()

def build_structure_block(folders):
    """Generates a text-based folder structure tree block."""
    lines = ["```", "Jabha-Assignments/"]
    for folder in folders:
        lines.append(f"├── {folder}/")
    lines.append("```")
    return "\n".join(lines)

def build_progress_block(root, folders):
    """Generates a clean markdown table matching whatever directories are present."""
    lines = ["| Topic Folder | Clean Title | Status | Last Updated |", "|---|---|---|---|"]
    for folder in folders:
        path = os.path.join(root, folder)
        status = "✅ Done" if has_java_files(path) else "⬜ Empty"
        title = format_title(folder)
        updated = last_modified(path) if has_java_files(path) else "—"
        lines.append(f"| `{folder}` | {title} | {status} | {updated} |")
    return "\n".join(lines)

def replace_block(content, marker_key, new_block):
    """Finds hidden markdown tags and overwrites the content inside securely."""
    start, end = MARKERS[marker_key]
    pattern = re.compile(re.escape(start) + r".*?" + re.escape(end), re.DOTALL)
    replacement = f"{start}\n{new_block}\n{end}"
    if not pattern.search(content):
        print(f"⚠️ Markers for {marker_key} not found — skipping section.")
        return content
    return pattern.sub(replacement, content)

def main():
    parser = argparse.ArgumentParser(description="Dynamically update assignment folders into README.md")
    parser.add_argument("--root", default=".", help="Project root path")
    args = parser.parse_args()

    root = os.path.abspath(args.root)
    readme_path = os.path.join(root, "README.md")

    if not os.path.isfile(readme_path):
        print(f"❌ Error: README.md not found at {readme_path}", file=sys.stderr)
        sys.exit(1)

    folders = get_valid_topic_folders(root)

    with open(readme_path, "r", encoding="utf-8") as f:
        content = f.read()

    content = replace_block(content, "STRUCTURE", build_structure_block(folders))
    content = replace_block(content, "PROGRESS", build_progress_block(root, folders))

    with open(readme_path, "w", encoding="utf-8") as f:
        f.write(content)

    print(f"✅ README.md dynamic generation successful! ({len(folders)} topics mapped)")

if __name__ == "__main__":
    main()