package P_01_Array.P_02_TwoDiamensionalArray;

import java.util.Arrays;

import static P_01_Array.P_02_TwoDiamensionalArray.C_01_SpiralMatrix.Print2DArray;

public class C_04_TransposeOfMatrix {
    public static void swap(int[][] arr, int[] a){
        int temp=arr[(a[0])][(a[1])];
        arr[(a[0])][(a[1])]=arr[(a[1])][(a[0])];
        arr[(a[1])][(a[0])]=temp;

    }

    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        TransposeConvert(arr);
        Print2DArray(arr);
    }
    static void TransposeConvert(int[][] arr){
        int col=0;
        int[] a= new int[2];
        while(col<arr[0].length-1){
            for(int j=col;j<arr[0].length;j++){
                a[0]=col;
                a[1]=j;
                swap(arr,a);
            }
            col+=1;
        }
    }
}
