package P_04_Searching;

public class C_03_quadratic_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,8,10};
        int target = 10;
        System.out.println(QuadraticSearch(arr,target));
    }
    static int QuadraticSearch(int[] arr, int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m = s+(e-s)/2;
            int p1 = s+(e-s)/4;
            int p2 = s+3*(e-s)/4;

            if(target==arr[m] || target==arr[p1] || target==arr[p2]){
                return m;
            }
            else if(target<arr[m] && target<arr[p1]){
                e=p1-1;
            }
            else if(target<arr[m] && target>arr[p1]) {
                s = p1 + 1;
                e=m-1;
            }
            else if(target>arr[m] && target>arr[p2]) {
                s = p2 + 1;
            }
            else if(target>arr[m] && target<arr[p2]) {
                s = m + 1;
                e = p2 - 1;
            }
        }
        return -1;
    }
}
