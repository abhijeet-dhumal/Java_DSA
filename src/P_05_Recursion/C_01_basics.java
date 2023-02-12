package P_05_Recursion;

import java.sql.Array;

/*
Defintion :
It is a method of solving a computaional problem where the
solution depends on solution to
'smaller instances of same problem'.

steps:
    1) Find base case
    2) Find relation between problem and sub-problem
    3) Generalise the relation

 */
public class C_01_basics {
    public static void main(String[] args) {
        System.out.println(SumOfN(10));//>> 56
        System.out.println(powerOf(5,5));//>> 3125
        System.out.println(factorial(5)); //>> 120
        int[]  arr = {1,2,3,4,3,5};
        System.out.println("Array sorted or not : "+ SortedOrNot(arr,0));
        //>> true
        System.out.println("First occurence of 3 is at index : "+FirstOccurence(arr,3,0));
        //>> "First occurence of 3 is at index : 2"
        System.out.println("Last occurence of 3 is at index :"+LastOccurence(arr,3,arr.length-1));
        //>> "Last occurence of 3 is at index : 4"
    }
    static int LastOccurence(int[] arr, int target, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return LastOccurence(arr,target,i-1);
    }
    static int FirstOccurence(int[] arr, int target, int i){
        if (i==arr.length){
            return -1;
        }
        if(arr[i]==target){
           return i;
       }

       return FirstOccurence(arr,target,i+1);
    }
    static boolean SortedOrNot(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return SortedOrNot(arr,i+1);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int SumOfN(int n){
        if(n==0) return 1;
        return n+SumOfN(n-1);
    }
    static int powerOf(int a, int b){
        if(b==0) return 1;
        return a*powerOf(a,b-1);
        /*
        int res=1;
        while(b>0){
            res=res*a;
            b-=1;
        }
        return res;
        */
    }
    /*

    sum(10) = 10+sum(10-1)
            = 10+9+sum(9-1)
            = 10+9+8+sum(8-1)
            ...

     */
}
/*

output :
56
3125

 */