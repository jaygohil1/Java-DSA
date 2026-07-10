import java.util.Arrays;

//An anagram of a string is another string that
// contains the exact same characters, but in a different order.
//LISTEN   --> SILENT INTEGRAL --> TRIANGLE
public class AnagramStr     {
    public static void main(String[] args) {
        String s1 = "INTEGRAL";
    String s2 = "TRIANGLE";
    boolean ans = isAnagram(s1,s2);
        System.out.println(ans);

    }
static boolean isAnagram(String s1,String s2){
    if (s1.length() != s2.length()) {
        return false;
    }
    char[] s1arr = s1.toCharArray();
    char [] s2arr = s2.toCharArray();

    Arrays.sort(s1arr);
    Arrays.sort(s2arr);

    System.out.println(Arrays.toString(s1arr)+" "+Arrays.toString(s2arr));

    if (Arrays.equals(s1arr,s2arr)){
        return true;
    }


    return false;
}
}
