package Beginner;

import java.util.Scanner;

/**
   36,24 : GCD and LCM:-
    brut force : for GCD iterating from 24 to 2, and checking which number divides both numbers and return
    aproack : 36%24 =12
                24%12=0 so no. which makes number remainder 0 is GCD
 **/
public class C_08_GCD_LCM {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();

        System.out.print("GCD: "+GCD(a,b)+", LCM: "+LCM(a,b));
//        System.out.println();
    }
    static int GCD(int a,int b){
//        if(b>a){
//            int temp= b;
//            b=a;
//            a=temp;
//        }
//        while(a%b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
        if (a%b==0){
            return b;
        }
        if(b>a){
            return GCD(b,a);
        }
        return GCD(a%b,b);
    }
    static int LCM(int a,int b){
        int lcm = a*b/GCD(a,b);
        return lcm;
    }
}
