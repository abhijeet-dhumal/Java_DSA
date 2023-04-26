package P_08_Sorting.P_05_DivideConquer;
import java.util.*;
/*
arr = {6,3,9,5,2,8}
si=0, ei=5

left1 = |6 |3 |9 |
    left 11 = |6 |3 |                     right 12 = |9 |(sorted)
    left 111 = |6 |(sorted), right 112 = |3 |(sorted)

right1 = |5 |2 |8 |
    left 11 = |5 |2 |                     right 12 = |8 |(sorted)
    left 111 = |5 |(sorted), right 112 = |2 |(sorted)

steps :
1) divide problem into smallest sorted sub-parts
2) divide arr  at mid
3) divide(left), divide(right), conquer(left ,mid, right)


1)          |6|3|9|5|2|8|               si=0, mid=2, ei=5
2)     |6|3|9|         |5|2|8|          si=0, mid=2 | mid+1=3,ei=5
3)   |6|3|   |9|     |5|2|   |8|        si=0, mid=1 ei=2| si=2, mid+1=2, ei=2|
                                            si=3, mid=3,ei=4| si=5, mid+1=5, ei=5
4)  |6| |3|  |9|    |5| |2|  |8|   (already sorted elements) (hits base case)

5)   |3|6| |9|       |2|5| |8|
6)    |3|6|9|         |2|5|8|
7)         |2|3|5|6|8|9|

Steps 1) to 4) performs divide
steps 5) to 7) performs conquer
 */
public class MergeSort {

    public static void conqure(int[] arr,int start, int mid, int end) {
        //conquer method time complexity is O(n)
        int[] temp=new int[end -start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                temp[x++] = arr[idx1++];
            }else{
                temp[x++] = arr[idx2++];
            }
        }

        //if left part some elements are remained to add in temp
        while (idx1 <= mid){
            temp[x++] = arr[idx1++];
        }

        //if right part some elements are remained to add in temp
        while (idx2 <= end){
            temp[x++] = arr[idx2++];
        }

        //copy all sorted elements to original arr
        for(int i=0,j=start ; i < temp.length ; i++,j++){
            arr[j]= temp[i];
        }
    }
    public static void divide(int arr[] , int start , int end){
        //below operation takes O(k)
        if(start >= end){
            return;
        }
        int mid  = start + (end - start)/2;

        //below op takes O(n/2)
        divide(arr,start,mid); //left part
        divide(arr,mid+1,end); //right part

        //below op takes O(n) time
        conqure(arr,start,mid,end); //merge both parts

        //total complexity
        // recurrent relation = o(n/2)+O(n/2)+O(n+k)
        /*
        addition of k is ignored
        O(n/2)+O(n/2)+O(nk) = 2*O(n/2)+O(nk)

         */
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int[] arr2 = arr.clone();
        int size = arr.length;
        divide(arr, 0, size-1);
        System.out.println("Sorted of arr "+Arrays.toString(arr2)+" is  : "+Arrays.toString(arr));
        System.out.println();
    }
} 
