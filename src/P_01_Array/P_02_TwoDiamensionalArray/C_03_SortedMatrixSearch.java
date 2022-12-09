package P_01_Array.P_02_TwoDiamensionalArray;

import java.util.Arrays;

public class C_03_SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
            };
        int target=48;
        System.out.println(Arrays.toString(RowWiseSortedMatrixSearch(arr,target)));
    }
    static int[] RowWiseSortedMatrixSearch(int[][] arr,int target){
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++){
            int s=0,e=arr[i].length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(target==arr[i][e]){
                    ans[0]=i;
                    ans[1]=e;
                    return ans;
                }else if(target>arr[i][e]){
                    break;
                }
                else {
                    if (target < arr[i][mid]) {
                        e = mid - 1;
                    } else if (target > arr[i][mid]) {
                        s = mid + 1;
                    } else {
                        System.out.println("Found");
                        ans[0] = i;
                        ans[1] = mid;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }

}
