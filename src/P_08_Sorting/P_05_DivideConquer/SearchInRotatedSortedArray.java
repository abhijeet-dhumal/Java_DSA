package P_08_Sorting.P_05_DivideConquer;

public class SearchInRotatedSortedArray {
    static int  search(int[] arr,int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        //kaam
        int mid=si+(ei-si)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }
        //if mid on line 1
        if(arr[si]<=arr[mid]){
            //case A : left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,si,mid-1,target);
            }
            //case B : right
            else{
                return search(arr,mid+1,ei,target);
            }
        }
        // mid on line 2
        else{
            //case c : right
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,mid+1,ei,target);
            }else{
                return search(arr,si,mid-1,target);
            }
        }
    }
    static int  searchUsingIteration(int[] arr,int si, int ei, int target){
        while(si<=ei) {
            int mid = si + (ei - si) / 2;

            //case found
            if (arr[mid] == target) {
                return mid;
            }
            //if mid on line 1
            if (arr[si] <= arr[mid]) {
                //case A : left
                if (arr[si] <= target && target <= arr[mid]) {
                    ei=mid-1;
                }
                //case B : right
                else {
                    si=mid+1;
                }
            }
            // mid on line 2
            else {
                //case c : right
                if (arr[mid] <= target && target <= arr[ei]) {
                    si=mid-1;
                } else {
                    ei=mid+1;
                }
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BinarySearch(arr,si,mid-1,target);
        }else{
            return BinarySearch(arr,mid+1,ei,target);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,0,1,2};
        /*
            |       O
            |   O
            |O                  O
            |               O
          __|___________O________
            |
         */
        int target = 0;
        System.out.println(search(arr,0,arr.length-1,target)); //>> 3
        System.out.println(searchUsingIteration(arr,0,arr.length-1,target)); //>>3
    }

}
