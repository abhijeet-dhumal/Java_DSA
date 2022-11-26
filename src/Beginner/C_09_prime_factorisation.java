package Beginner;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
//factors of a number
public class C_09_prime_factorisation {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=inp.nextInt();
        System.out.println(PrimeFactorization(n));
    }
    static ArrayList<Integer> PrimeFactorization(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int smallest_divisor=SmallestDivisor(n);
        while(n%smallest_divisor==0){
            list.add(smallest_divisor);
            n/=smallest_divisor;
            if(n<2){
                return list;
            }
            smallest_divisor=SmallestDivisor(n);
        }
        return list;
    }
    static int SmallestDivisor(int n){
        int i=2;
        while(i<Math.sqrt(n)){
            if (n%i==0){
                return i;
            }
            i++;
        }
        return n;
    }
}
