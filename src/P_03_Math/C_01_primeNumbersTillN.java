package P_03_Math;

import java.util.Arrays;
import java.util.Scanner;

public class C_01_primeNumbersTillN {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();

        //previous method
        for(int i=2;i<=n;i++){
            if(prime_previous(i)) System.out.print(i+"\t");
        }
        System.out.println("\n");

        //Eratosthenes algorithm
        primeTillN(n);
    }
    static void primeTillN(int n){
        boolean[] arr = new boolean[n+1];

//        initialise all value of indices with true which are greater than or equal to 2
        for(int i=0;i<=n;i++){
            if(i<2) arr[i]=false;
            else arr[i]=true;
        }
        System.out.println(Arrays.toString(arr));

//        till sqrt of n th index mark all repeatitive multiples false
        for(int i=2;i*i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(j>i && arr[j]==true){
                    arr[j]=false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=n;i++){
            if (arr[i]) System.out.print(i+"\t");
        }
        System.out.println();
    }

    static boolean prime_previous(int n){
        if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if (n%i==0) return false;
        }
        return true;
    }
}

/*

20
2	3	5	7	11	13	17	19

[false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]
[false, false, true, true, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, true, false]
2	3	5	7	11	13	17	19

 */