package P_05_Recursion.Practice;
import java.util.*;
public class P_04_SomeApps {

     static int sumOfNM(int n){
         if(n <= 1){
             return n;
         }
        return n = n+sumOfNM(n-1);
     }

     static void revString(String str ) {

         if (str == null || str.length() <= 1) {
             System.out.println(str);
             return;
         } else {
             System.out.print(str.charAt(str.length() - 1));
             revString(str.substring(0, str.length() - 1));
         }

     }

         static void isPalindrom (String str,int a, int b){
             System.out.println(a + "&" + b);
             if (a >= b) {
                 System.out.println("The String is a palindrom :) ");
                 return;
             }
             if (str.charAt(a) != str.charAt(b)) {
                 System.out.println(str.charAt(a) + " # " + a);
                 System.out.println(str.charAt(b) + " # " + b);
                 System.out.println("The Stirng is not a Palindrom :(");
                 return;
             } else {
                 isPalindrom(str, a + 1, b - 1);
             }
         }

         //Q1------
         static void printDigit ( int ipt){
             if (ipt < 10) {
                 System.out.print(ipt);
                 return;
             }

             int opt = ipt % 10;
             System.out.print("" + opt);
             printDigit(ipt / 10);

         }

         public static void main (String[]args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a Integer value : ");
             int ipt = sc.nextInt();
             printDigit(ipt);
             System.out.println("\n/////////");

             String strs = "abcd";
             isPalindrom(strs, 0, strs.length() - 1);

         }

}