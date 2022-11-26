package P_02_Pattern;

import java.util.Scanner;

public class C_09_fibonacci_pattern {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a+" \t");
                c=b;
                b=a+b;
                a=c;
            }
            System.out.println();
        }
    }
}
