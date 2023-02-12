package P_04_Searching;

import java.util.Arrays;

public class C_02_StairCaseSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int target=48;
        System.out.println(Arrays.toString(StairCaseSearch(arr,target)));
    }
    static int[] StairCaseSearch(int[][] arr,int target){
        int[] ans={-1,-1};
        int row=0, col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                ans[0]=row;
                ans[1]=col;
                return ans;
            }
            else if(arr[row][col]>target){
                col-=1;
            } else if (arr[row][col]<target) {
                row++;
            }
        }
        return ans;
    }
}
