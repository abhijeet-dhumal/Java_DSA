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



/*

1         1
 2       2
  3     3
   4   4
     5
   4   4
  3     3
 2       2
1         1

n=int(input())
for i in range(2*n-1):
    if(i<n):
        for j in range(i):
            print(" ",end="")
        if(i+1==n):
            print("",i+1,end="")
        else:
            print(i+1,end="")
        for j in range(2*n-2*i-1):
            print(" ",end="")
        if(i+1!=n):
            print(i+1,end="")
    else:
        for j in range(2*n-i-2):
            print(" ",end="")
        print(2*n-i-1,end="")
        for j in range(2*i-n-2):
            print(" ",end="")
        print(2*n-i-1,end="")

    print()


 */