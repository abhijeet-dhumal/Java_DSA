package P_08_Sorting.P_05_DivideConquer;
import java.util.*;

/* >> pivot and partition technique:

Note : Worst case complexity (occurs when pivot is smallest or largest)
1,2,3,4,5 - partition n times
1,2,3,4 - n-1 times
1,2,3 - n-2
1,2 - n-3
1- n-4 times
n+(n-1)+(n-2)+...+3+2+1 = n(n+1)/2 =(n^2+n)/2

Worst Time complexity = O(n^2)

Steps:
    1) pivot : random/ median/ first/ last elem
    Here pivot == last elem
    2) Partition (parts)
    3) QuickSort(left), QuickSort(right)

for example : arr=[6,3,9,8,2,5]
    1) Pivot = 5
    2) Partition(low,high) : 3,2 < 5 < 6,9,8
    3) QuickSort(low, pi-1),
        QuickSort(pi+1,high)

>> partition procedure :
|6|3|9|8|2|5|

i=-1,  j=0, (arr[j]!<pivot) : |6|3|9|8|2|5|
i=0,   j=1, (arr[j]<pivot) : |3|6|9|8|2|5|
        j=2, (arr[j]!<pivot): |3|6|9|8|2|5|
        j=3, (arr[j]!<pivot): |3|6|9|8|2|5|
i=1,    j=4, (arr[j]<pivot): |3|2|9|8|6|5|

i++ ==> i=2
|3|2|5|8|6|9| ==> pivot is placed at middle to its correct position
return pivot index i

 */
public class QuickSort {

    public static int partition(int arr[]  , int low , int high ){
        int pivot = arr[high];
        int i = low - 1; //initially -1 , to make places for smaller elements than pivot
        for(int  j = low; j<high ; j++){
            //Swapping all smaller element in left side 
            if(arr[j] < pivot){
                i++;
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swapping pivot in actual place 
        i++;
        int temp  = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void sort(int arr[],int low , int high){
        if(low < high){
            int pi = partition(arr, low , high);
            sort(arr, low, pi-1);
            sort(arr, pi+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int[] arr2 = arr.clone();
        int size = arr.length;
        sort(arr, 0, size-1);
        System.out.println("Sorted of arr "+Arrays.toString(arr2)+" is  : "+Arrays.toString(arr));
        System.out.println();
    }
}