package P_05_Recursion;
import java.util.Scanner;
public class C_08_TrickyProb {
    public static void fun(int n){
        if( n == 0){
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt(); //<< 5
        fun(n); // 1 2 3 4 5
        
    }
}