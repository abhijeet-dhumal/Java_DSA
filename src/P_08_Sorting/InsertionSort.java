package P_08_Sorting;

import java.util.Arrays;

import static P_08_Sorting.BubbleSort.swap;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3};
        //Insertion Sort ----
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
