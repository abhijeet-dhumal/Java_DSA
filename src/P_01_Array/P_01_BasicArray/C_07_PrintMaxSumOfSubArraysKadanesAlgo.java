package P_01_Array.P_01_BasicArray;

//Kadane's Algo '
/*

big +ve + big +ve --> big +ve
big +ve + small -ve --> big +ve
big -ve + small +ve --> consider 0
small -ve + small -ve --> consider 0

        Exapmle-1 :             {1,-2,6,-1,3}

                    Sum         1   -1  5   4   7
                    CurrentSum  1   0   6   5   8
                    MaxSum      1   1   6   6   8

         Example 2 :            {-2,-3,4,-1,-2,1,5,-3}

                    Sum         -2  -5  -1  -2  -4  -3  2   -1
                    CurrentSum  0   0   4   3   1   2   7   4
                    MaxSum      0   0   4   4   4   4   7   7

         */
public class C_07_PrintMaxSumOfSubArraysKadanesAlgo {
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        System.out.println("Max sum of all possible subarrays of arr is : "+KadanesPrintMaxSumOfSubArrays(arr));
    }
    static int KadanesPrintMaxSumOfSubArrays(int[] arr){
        //check if all elements are not negative if yes then return biggest -ve number
        boolean isAllNeg=true;
        int minNeg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>minNeg){
                minNeg=arr[i];
            }
            if (arr[i]>0 && isAllNeg==true){
                isAllNeg=false;
            }
        }
        if (isAllNeg){
            return minNeg;
        }else {
            int CurrentSum=0 , MaxSum=Integer.MIN_VALUE;
            for (int i = 1; i < arr.length; i++) {
                CurrentSum += arr[i];
                if (CurrentSum < 0) {
                    CurrentSum = 0;
                }
                if (CurrentSum > MaxSum) {
                    MaxSum = CurrentSum;
                }
            }
            return MaxSum;
        }
    }
}
