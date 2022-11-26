/**

 1
 1  1
 1  2   1
 1  3   3   1
 1  4   6   4   1
 1  5   10  10  5   1

 **/


package P_02_Pattern;

import java.util.Scanner;

public class C_10_pillars_of_randomness {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((factorial(i)/(factorial(j)*factorial(i-j)))+"\t");
            }
            System.out.println();
        }
    }

    static int factorial(int n){
        int c=1;
        while(n>0){
            c*=n;
            n-=1;
        }
        return c;
    }
}
