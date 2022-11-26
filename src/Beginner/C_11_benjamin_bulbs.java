/**
 * You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation, all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation, every 3rd bulb is toggled, and so on. You've to find which bulbs will be switched on after n fluctuations.
 * Take as input a number n, representing the number of bulbs.
 * Print all the bulbs that will be on after the nth fluctuation in voltage.
 *
 * Input format:
 * n, an integer
 *
 * Output format:
 * b1 b2 b3 b4 .. all bulbs that will be on after nth wave
 *
 * Constraints:
 * 2 <= n < 10^9
 **/


package Beginner;

import java.util.Arrays;
import java.util.Scanner;

public class C_11_benjamin_bulbs {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        bruteForce(n);
        efficient(n);
    }
    static void efficient(int n){
        for(int i=1;i*i<n;i++){
            System.out.print(i*i+" ");
        }
        System.out.println();
    }
    static void bruteForce(int n){
        boolean[] arr= new boolean[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=false;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=n;j++){
                if(j%i==0){
                    if (arr[j-1]){
                        arr[j-1]=false;
                    }else {
                        arr[j-1] = true;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]){
                count++;
                System.out.print(i+1+" ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
