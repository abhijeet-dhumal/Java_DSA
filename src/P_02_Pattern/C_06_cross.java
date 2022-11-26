/**

 *              *
    *       *
        *
    *       *
 *              *

 l1 : st1,sp4, st1
 l2 : sp1,st1,sp2, st1
 l3 : sp0, st5
 l4 : sp1, st3
 l5 : sp2, st1
**/

package P_02_Pattern;

import java.util.Scanner;

public class C_06_cross {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
