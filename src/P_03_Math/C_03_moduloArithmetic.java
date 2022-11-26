package P_03_Math;

import java.util.Scanner;

public class C_03_moduloArithmetic {
    public static void main(String[] args) {
//        Scanner inp=new Scanner(System.in);
//        int n=inp.nextInt();
        System.out.println(fastPower(5,5, 1000000007 /* for grater values of a and b (10^9 + 7) */));
    }
    static int fastPower(int a,int b, int n){
        int res=1;
        while(b>0){
            if ((b&1)!=0){
                res=((res%n) * (a%n))%n;
            }
            a=((a)%n*(a)%n)%n;
            b=b>>1;
        }
        return res;
    }
}
