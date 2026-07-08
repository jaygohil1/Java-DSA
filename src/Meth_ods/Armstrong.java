package Meth_ods;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Armstrong {
     public static void main(String[] args) {
         System.out.println("Three digit Armstrong numbers :");
         isArmstrong();
    }

   static void isArmstrong() {
       for (int i = 100; i <1000 ; i++) {
           int num = i;

           while(num!=0){
               int digit1 = num%10;
               num/=10;
               int digit2 = num%10;
               num/=10;
               int digit3 = num%10;
               num/=10;
               int sumcube;
               sumcube = (digit1*digit1*digit1) + (digit2*digit2*digit2)+(digit3*digit3*digit3);
               if(sumcube == i){
                   System.out.println(sumcube);

               }


           }


       }
    }
}
