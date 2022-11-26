/**

        1
    2	3	2
 3	4	5	4	3
    2	3	2
        1

 **/

package P_02_Pattern;

import java.util.Scanner;

public class C_11_number_diamond {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int sp=n/2;
        int in=1;
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            int cval=val;
            for(int j=0;j<in;j++){
                System.out.print(cval+"\t");
                if(j<in/2){
                    cval+=1;
                }else{
                    cval-=1;
                }
            }
            if(i<n/2){
                sp-=1;
                in+=2;
                val++;
            }else{
                sp+=1;
                in-=2;
                val--;
            }
            System.out.println();
        }
    }
}
