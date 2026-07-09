//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

import java.util.Scanner;

public class GradeCheker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int usermarks = in.nextInt();
        String grade = gradecheck(usermarks);
        System.out.println("Your grade is: "+grade);

    }
    static String gradecheck(int marks){
       if (91<=marks && marks<=100){
           String aa = "AA";
            return aa;
       }
       else if (81<=marks && marks<=90) {
           return "AB";
       }
       else if (71<=marks && marks<=80) {
           return "BB";
       }
       else if (61<=marks && marks<=70) {
           return "BC";
       }
       else if (51<=marks && marks<=60) {
           return "CD";
       }
       else if (41<=marks && marks<=50) {
           return "DD";
       }
       else if(marks>=0&&marks<=40){
           return "Fail";
       }

       return "Invalid";
    }
}
