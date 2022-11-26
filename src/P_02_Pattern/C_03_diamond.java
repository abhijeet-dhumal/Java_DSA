/**

        *
    *   *   *
*   *   *   *   *
    *   *   *
        *

 l1 : sp2, st1
 l2 : sp1, st3
 l3 : sp0, st5
 l4 : sp1, st3
 l5 : sp2, st1

 **/

package P_02_Pattern;

import java.util.Scanner;

public class C_03_diamond {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int n=inp.nextInt();
        int sp=n/2;
        int st=1;
        for(int i =0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                sp--;
                st+=2;
            }
            else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }

    }
}
