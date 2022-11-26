/*

    1								1
    1	2						2	1
    1	2	3				3	2	1
    1	2	3	4		4	3	2	1
    1	2	3	4	5	4	3	2	1

*/


package P_02_Pattern;

import java.util.Scanner;

public class C_12_numbers_valley {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int c=1;
        int sp=n*2-3;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+"\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            if(i+1<n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(i + 1 - j + "\t");
                }
            }else{
                for (int j = 0; j < i ; j++) {
                    System.out.print(i - j + "\t");
                }
            }
            sp-=2;
            System.out.println();
        }
    }
}
