package P_01_Array.P_02_TwoDiamensionalArray;

public class C_02_DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
            };
        DiagonalSum(arr);
    }
    static void DiagonalSum(int[][] arr){
        int sumLeftToRight=0, sumRightToLeft=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sumLeftToRight+=arr[i][j];
                }
                if(i!=j && i+j==arr[i].length-1){
                    sumRightToLeft+=arr[i][j];
                }
            }
        }
        System.out.println(sumLeftToRight+"\t"+sumRightToLeft);
    }
}
