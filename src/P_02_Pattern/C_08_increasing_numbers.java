package P_02_Pattern;

import java.util.Scanner;

public class C_08_increasing_numbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
        }
    }
}
