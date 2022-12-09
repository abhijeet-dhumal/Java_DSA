package P_04_Searching.P_01_BinarySearch;

public class C_01_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,2,7,11,8};
        int target  = 7;
        System.out.println("The index of target element \'"+target+"\' : "+BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr, int target){
        int s=0;
        int e =arr.length-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (arr[m]==target){
                return m;
            }
            else if(target<arr[m]){
                e=m-1;
            }
            else {
                s = m + 1;
            }
        }
        return -1;
    }
}
