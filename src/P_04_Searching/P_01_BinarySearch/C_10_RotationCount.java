package P_04_Searching.P_01_BinarySearch;

public class C_10_RotationCount {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            //if mid index is less than end index and
            //if mid element > mid+1 element of array
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }else if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }


}