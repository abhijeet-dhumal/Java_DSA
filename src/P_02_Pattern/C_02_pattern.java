/**
           *   *   *   *   *
               *   *   *   *
                   *   *   *
                       *   *
                           *
 **/

package P_02_Pattern;

import java.util.Scanner;

public class C_02_pattern {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("\t");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
