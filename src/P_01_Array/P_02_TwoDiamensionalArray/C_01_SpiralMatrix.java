package P_01_Array.P_02_TwoDiamensionalArray;

import java.util.Arrays;

public class C_01_SpiralMatrix {
    public static void Print2DArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3,4},
//                {12,13,14,5},
//                {11,16,15,6},
//                {10,9,8,7}
//            };
        int[][] arr = {
                {1,2,3,},
                {8,9,4},
                {7,6,5}
        };

        Print2DArray(arr);
        SpiralMatrixPrint(arr);
    }
    static void SpiralMatrixPrint(int[][] arr){
        int startCol=0;
        int endCol=arr[0].length;
        int startRow=0;
        int endRow=arr.length;
        while(startRow<endRow && startCol<endCol){
            //top
            for(int j=startCol;j<endCol;j++){
                System.out.print(arr[startRow][j]+"\t");
            }
            //right
            for(int i=startRow+1;i<endRow;i++){
                System.out.print(arr[i][endCol-1]+"\t");
            }

            //bottom
            for(int i=endCol-2;i>=startCol;i--){
                System.out.print(arr[endRow-1][i]+"\t");
            }

            //left
            for(int j=endRow-2;j>=startRow+1;j--){
                System.out.print(arr[j][startCol]+"\t");
            }

            startRow+=1;
            endRow-=1;
            startCol+=1;
            endCol-=1;
        }
    }
}
