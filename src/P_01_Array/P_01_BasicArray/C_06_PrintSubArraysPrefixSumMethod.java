package P_01_Array.P_01_BasicArray;

//print max and minsum among all subbarrays possible of an array with prefix sum method

import java.util.Arrays;

public class C_06_PrintSubArraysPrefixSumMethod {

    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        PrintSubArrays(arr);
        /* output :
        Main arr : [1, -2, 6, -1, 3]
        prefixSum arr : [1, -1, 5, 4, 7]
        MinSum: -2 | MaxSum: 8
        */
    }
    static void PrintSubArrays(int[] arr){
        //BrutForce
        int minSum=Integer.MAX_VALUE,maxSum=Integer.MIN_VALUE;

        int[] prefixSum = new int[arr.length];
        //calculate prefix array
        //there is a pattern through which 3rd loop is not required in this case
        prefixSum[0]=arr[0];
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        System.out.println("Main arr : "+Arrays.toString(arr));
        System.out.println("prefixSum arr : "+Arrays.toString(prefixSum));
        int start=0,end=0;
        for(int i=0;i<arr.length;i++) {
            start=i;
            for (int j = i; j < arr.length; j++) {
                end=j;
                int sum=0;
                //for(int k=i;k<=j;k++) {
                //    System.out.print(arr[k] + " ");
                //    sum+=arr[k];
                //}
                //System.out.print("|");

                //to get sum of elements from start to end index with formula
                //to avoid negative indexing case
                sum = ( start==0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1] );

                if (sum<minSum){
                    minSum=sum;
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("MinSum: "+minSum+" | MaxSum: "+maxSum);
    }
}
