/*
Question1:
Apply Mergesort to sort an array of Strings.
(Assume that all the characters in all the Strings
are in lowercase). (EASY)
Sample Input 1:
    arr = { "sun", "earth", "mars", "mercury"}
Sample Output 1:
    arr = { "earth", "mars", "mercury","sun"}
 */

package P_08_Sorting.P_05_DivideConquer.AssignmentQuestions;

import java.util.Arrays;

public class Q_1_MergeSortStrings {
    static boolean isAlphabeticallySmaller(String str1,String str2) {
        if(str1.compareTo(str2) <0) {
            return true;
        }
        return false;
    }
    public static String[] Conquer(String[] arr1, String[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        String[] arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m&&j<n) {
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx++] =arr1[i++];
            }else {
                arr3[idx++] = arr2[j++];
            }
        }
        while(i<m) {
            arr3[idx++] =arr1[i++];
        }
        while(j<n) {
            arr3[idx++] =arr2[j++];

        }
        return arr3;
    }
    public static String[] Divide(String[] arr,int start, int end){
        if(start == end){
            return new String[] {arr[start]};
        }

        int mid  = start + (end - start)/2;
        String[] arr1 = Divide(arr,start,mid); //left part
        String[] arr2 = Divide(arr,mid+1,end); //right part
        String[] arr3 = Conquer(arr1,arr2); //merge both parts
        return arr3;
    }
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury"};
        System.out.println(Arrays.toString(Divide(arr, 0, arr.length-1)));
        //>> [earth, mars, mercury, sun]
    }
}
