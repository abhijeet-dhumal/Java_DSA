/*

    Idea : pick the smallest (from unsorted),
            put it at the beginning
[5,4,1,3,2]

smallest=1 pusshed at beginning, 1| 5 4 3 2
smallest=2 pusshed at beginning, 1 2| 5 4 3
smallest=3 pusshed at beginning, 1 2 3| 5 4
smallest=4 pusshed at beginning, 1 2 3 4| 5
 */

package P_08_Sorting.P_02_SelectionSort;
public class C_01_SelectionSort {
    public static void printArray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3};
        SelectionSort(arr);
        printArray(arr);
    }

    static void SelectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]<arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
    }
    static void ReverseSelectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]<arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
    }
}
