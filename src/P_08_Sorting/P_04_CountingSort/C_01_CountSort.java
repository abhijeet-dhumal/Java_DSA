/*
def : Counting sort is a sorting technique based on
    keys between a specific range.
    It works by counting the number of objects having
    distinct key values (a kind of hashing).
    Then do some arithmetic operations to calculate
    the position of each object in the output sequence.

Time Complexity : O(n+ range)
    range of min to max

 Example 1 :  arr = {1 4 1 3 2 4 3 7}

 1) count frequency
              0 1 2 3 4 5 6 7
 count_arr = {0,2,1,2,2,0,0,1}

2) rearrange original arr using count_arr
    min(arr)=1, max(arr)=7, j=0
    for i in range(min(arr) to max(arr)):
        for i=1,
            while  cnt_arr[i](2 1) >0 ,
                then cnt_arr[i](2)-=1 and arr[j(0)](1)=i(1) then j++ (1)
                then cnt_arr[i](1)-=1 and arr[j(1)](4)=i(1) then j++ (2)
        for i=2,
            while  cnt_arr[i](1) >0 ,
                then cnt_arr[i](1)-=1 and arr[j(2)](2)=i(2) then j++(3)
        for i=3,
            while  cnt_arr[i](2) >0 ,
                then cnt_arr[i](2)-=1 and arr[j(3)]=i(3) then j++(4)
                then cnt_arr[i](1)-=1 and arr[j(4)]=i(3) then j++(5)
        .
        .

        for i=5, as  cnt_arr[i]<=0 , skip
        for i=6, as  cnt_arr[i]<=0 , skip
        for i=7,
            while  cnt_arr[i](1) >0 ,
                then cnt_arr[i](1)-=1 and arr[j(6)](7)=i(7) then j++(8)

    arr = [1, 1, 2, 3, 4, 5, 3, 7]
 */


package P_08_Sorting.P_04_CountingSort;

import java.util.Arrays;
import java.util.Collections;

public class C_01_CountSort {
    public static void main(String[] args) {
        Integer[] arr={7, 4, 1, 3, 2, 4, 3, 1};
        ReverseCountingSort(arr);
        System.out.println("Original array: "+Arrays.toString(arr));
    }
    static void countingSort(Integer[] arr){
        Integer max= Collections.max(Arrays.asList(arr));
        Integer min= Collections.min(Arrays.asList(arr));
        System.out.println("Min value of arr : "+min);
        System.out.println("Max value of arr : "+max);

        int[] cnt_arr=new int[max+1];

        for(int i=0;i<arr.length;i++){
            cnt_arr[arr[i]]+=1;
        }
        System.out.println("Count arr : "+Arrays.toString(cnt_arr));

        int j=0;
        /*
        cnt_arr values from 0 to max value of arr are initialed with 0
        arr element frequencies are stored in cnt_arr
        j initialized with 0
        while arr elemnt(i) index value of cnt_arr greater than 0
            arr of jth index = arr element(i)
            j++
            then arr elemnt index of cnt_arr -=1
         */
        for(int i=min; i<=max; i++){
            while(cnt_arr[i]>0) {
                arr[j]=i;
                j++;
                cnt_arr[i] -= 1;
            }
        }
    }

    static void ReverseCountingSort(Integer[] arr){
        Integer max= Collections.max(Arrays.asList(arr));
        Integer min= Collections.min(Arrays.asList(arr));
        System.out.println("Min value of arr : "+min);
        System.out.println("Max value of arr : "+max);

        int[] cnt_arr=new int[max+1];

        for(int i=0;i<arr.length;i++){
            cnt_arr[arr[i]]+=1;
        }
        System.out.println("Count arr : "+Arrays.toString(cnt_arr));

        int j=0;
        /*
        cnt_arr values from 0 to max value of arr are initialed with 0
        arr element frequencies are stored in cnt_arr
        j initialized with 0
        while arr elemnt(i) index value of cnt_arr greater than 0
            arr of jth index = arr element(i)
            j++
            then arr elemnt index of cnt_arr -=1
         */
        for(int i=max; i>=min; i--){
            while(cnt_arr[i]>0) {
                arr[j]=i;
                j++;
                cnt_arr[i] -= 1;
            }
        }
    }
}
