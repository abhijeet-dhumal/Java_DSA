package P_01_Array.P_01_BasicArray;

import java.util.Arrays;

public class C_03_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,10,17,19};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int s=0,e=arr.length-1;
        int temp;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s+=1;
            e-=1;
        }
    }
}
