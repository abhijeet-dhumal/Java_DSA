package P_01_Array.P_01_BasicArray;

public class C_05_PrintSumOfSubArraysBrutForce {

    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        PrintSubArrays(arr);
        /*
        1 |1 -2 |1 -2 6 |1 -2 6 -1 |1 -2 6 -1 3 |
        -2 |-2 6 |-2 6 -1 |-2 6 -1 3 |
        6 |6 -1 |6 -1 3 |
        -1 |-1 3 |
        3 |
        MinSum: -2 | MaxSum: 8
         */
    }
    static void PrintSubArrays(int[] arr){
        //BrutForce
        int minSum=Integer.MAX_VALUE,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.print("|");
                if (sum<minSum){
                    minSum=sum;
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("MinSum: "+minSum+" | MaxSum: "+maxSum);
    }
}
