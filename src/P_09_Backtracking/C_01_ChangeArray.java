package P_09_Backtracking;

import java.util.Arrays;

public class C_01_ChangeArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        // initial arr = {0,0,0,0,0}
        ChangeArr(arr,0,1);
        // after change = {-1,0,1,2,3}
        /* BC-Base case
        |               |
        |CA()i=5(hits BC)|  |           |
        |CA() i=4, v=5  |   | i=4, v=3  |
        | CA() i=3, v=4 |   | i=3, v=2  |
        |CA() i=2, v=3  |   | i=2, v=1  |
        |CA() i=1, v=2  |   | i=1, v=0  |
        | CA() i=0, v=1 |   | i=0, v=-1 |
        |_______________|   |___________|
        Function calls      Backtracking
         */
        System.out.println("After change : "+ Arrays.toString(arr));

        /* >>
        Initialized vals Before Change: [1, 2, 3, 4, 5]
        After change : [-1, 0, 1, 2, 3]
         */
    }
    public static void ChangeArr(int[] arr,int i, int val){
        if(i==arr.length){
            System.out.println("Initialized vals Before Change: "+Arrays.toString(arr));
            return;
        }
        arr[i]=val;
        ChangeArr(arr,i+1,val+1); //fnx call step
        arr[i]-=2;  // Backtracking step
    }
}
