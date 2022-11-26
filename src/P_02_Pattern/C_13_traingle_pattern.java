/*
    1
    1	1
    1	2	1
    1	3	3	1
    1	4	6	4	1

* */


package P_02_Pattern;

import java.util.Scanner;

public class C_13_traingle_pattern {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+"\t");
            }
            System.out.println();
        }
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
