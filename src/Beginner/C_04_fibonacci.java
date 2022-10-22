package Beginner;

import java.util.Scanner;

public class C_04_fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value till which fibonacci series should be printed : ");
        int a=0,b=1, n=inp.nextInt(), i=0, temp=0;
        while(i<n){
            System.out.print(a+" ");
            temp = a+b;
            a=b;
            b=temp;
            i+=1;
        }
    }
}
