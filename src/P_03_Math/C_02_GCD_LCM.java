package P_03_Math;

import java.util.Scanner;
/*

Law : GCD(a,b) = GCD(a-b,b)
      GCD(a,b) = GCD(b,a%b)

      LCM of two numbers = product of two numbers ÷ HCF of two numbers.
 */

public class C_02_GCD_LCM {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt(),b=inp.nextInt();
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }
    static int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    //LCM of two numbers = product of two numbers ÷ HCF of two numbers.
    static int LCM(int a,int b){
        return a*b/GCD(a,b);
    }
}
