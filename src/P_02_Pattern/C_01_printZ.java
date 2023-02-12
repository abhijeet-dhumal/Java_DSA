package P_02_Pattern;

/**

 * * * * *
       *
     *
   *
 * * * * *

 **/
public class C_01_printZ {
    public static void main(String[] args) {
        int n=4,i=0;
        while(i<n){
            if (i==0 || i==(n-1) ) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            }
            else{
                for (int j = n-i-1; j >0; j--) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }

    }
}
