
/**

 *	*		*	*
 *				*

 *				*
 *	*		*	*

 l1 : st2,sp1,st2
 l2 : st1,sp2, st1
 l3 : st0,sp3, st0
 l4 : st1,sp2, st1
 l5 : st2,sp1, st2

 **/
package P_02_Pattern;

import java.util.Scanner;

public class C_04_hollow_diamond {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int st=n/2;
        int sp=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
