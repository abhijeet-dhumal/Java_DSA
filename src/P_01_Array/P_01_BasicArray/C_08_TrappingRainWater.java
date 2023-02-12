package P_01_Array.P_01_BasicArray;

import java.util.Arrays;

/*
Given n non-negative integers representing an elevation where the width of each map is 1 unit,
Compute how much water it can trap between bars

Auxillary arrays
I/P : {4,2,0,6,3,2,5}

                __6__
          h     |   |.......__5__
    __4__.......|   | water |   |
    |   | water |   |_3__   |   |
    |   |_2__   |   |   |_2_|   |
    |   | x |   |   |   |   |   |
____|___|___|_0_|___|___|___|___|___________
      1
Amount of water in 1 column (Area) = (h -x)*width
                where w = total height
                    x= column height
        =0+2+4+0+2+3+0 = 11

 */
public class C_08_TrappingRainWater {
    public static void main(String[] args) {
        int[] arr= {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Auxillary method ");
        System.out.println(CalcuteAmountOfWaterTrappedAuxillaryMethod(arr));
        System.out.println("\nBrut force");
        System.out.println(CalcuteAmountOfWaterTrappedBrutForce(arr));
        /*
        Auxillary method
        [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
        [2, 2, 2, 2, 1, 1, 1, 3, 2, 1, 2, 1]
        0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0,
        2

        Brut force
        0 1 0
        1 1 0
        1 3 1
        3 3 1
        4 4 1
        4 6 2
        6 6 2
        7 7 2
        8 8 2
        9 9 2
        10 10 2
        11 11 2
        2
         */
    }
    static int CalcuteAmountOfWaterTrappedAuxillaryMethod(int[] arr){
        //Auxillary arrays to store leftMax and rightMax boundaries of each element in arr
        //time complexity : O(n)
        int[] leftMaxBoundary=new int[arr.length];
        int[] rightMaxBoundary=new int[arr.length];

        int leftMax=0,rightMax=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[leftMax]){
                leftMaxBoundary[i]=arr[i];
                leftMax=i;
            }
            else{
                leftMaxBoundary[i]=arr[leftMax];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[arr.length-i-1]>arr[rightMax]){
                rightMaxBoundary[arr.length-i-1]=arr[arr.length-i-1];
                rightMax=i;
            }
            else{
                rightMaxBoundary[arr.length-i-1]=arr[rightMax];
            }
        }
        System.out.println(Arrays.toString(leftMaxBoundary));
        System.out.println(Arrays.toString(rightMaxBoundary));
        int sum=0,amount=0;
        for(int i=0;i<arr.length;i++){
            amount= leftMaxBoundary[i]>rightMaxBoundary[i] ? Math.abs(rightMaxBoundary[i]-arr[i]) : Math.abs(leftMaxBoundary[i]-arr[i]);
            System.out.print(amount+", ");
            sum+=amount;
        }
        System.out.println();
        return sum;
    }
    static int CalcuteAmountOfWaterTrappedBrutForce(int[] arr){
        //if arr size is less than or equal to 2 then water will not get stored
        //if Array values are asc or desc then also will not get stored
        //time complexity : O(n^2)
        if (arr.length<=2){
            return 0;
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            int left=i,right=i,amount=0,leftMax=0,rightmax=0;
            while(left>=0){
                if(arr[left]>arr[leftMax]){
                    leftMax=left;
                    break;
                }

                left--;
            };

            while(right<arr.length){
                if(arr[right]>arr[rightmax]){
                    rightmax=right;
                    break;
                }

                right++;
            };

            if(leftMax==rightmax){
                amount=0;
            }
            else {
                amount=(arr[leftMax]>arr[rightmax] ? Math.abs(arr[rightmax]-arr[i]) : Math.abs(arr[leftMax]-arr[i]));
            }
            sum+=amount;
            System.out.println(leftMax+" "+rightmax+" "+sum);

        }
        return sum;
    }
}
