
/**

  		*
    *		*
 *				*
    *		*
 		*

l1 : 2sp,*,0sp,*
l2 : 1sp,*,2sp,*
l3 : 0sp,*,4sp,*
l4 : 1sp,*,2sp,*
l5 : 2sp,*,0sp,*

 **/
package P_02_Pattern;

import java.util.Scanner;

public class C_07_inner_hollow_diamond {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int sp1=n/2;
        int sp2=0;
        for(int j=0;j<n;j++){
            for (int i=0;i<sp1;i++){
                System.out.print("\t");
            }
            System.out.print("*");
            for(int i=0;i<sp2;i++){
                System.out.print("\t");
            }
            if(j>0 && j<n-1) {
                System.out.print("*");
            }
            if(j<n/2){
                sp1--;
                sp2+=2;
            }else{
                sp1++;
                sp2-=2;
            }
            System.out.println();
        }
    }
}
