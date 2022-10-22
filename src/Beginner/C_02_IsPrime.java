package Beginner;
import java.util.Scanner;
public class C_02_IsPrime {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter no. of cases you want to check :");
        int n=inp.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Number : ");
            int t=inp.nextInt();
            System.out.println("IsPrime : \'"+prime(t)+"\'\n");
        }
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
