package P_05_Recursion;

import java.util.Arrays;
import java.util.Scanner;
/*
in matrix , only right and down transition is allowed
consider 4*4 matrix
No.of ways for each cell from cell arr[0][0]

     0   1   2   3
     _   _   _   _
0   |1   1   1   1
1   |1   2   3   4
2   |1   3   6   10
3   |1   4   10  20

No. of ways required to reach cell arr[i][j] = arr[i-1][j] + arr[i][j-1]

 */
public class C_02_NoOfWaysInMatrix {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt(),m=inp.nextInt();
        /*
        int[][] arr= new int[n][m];
        System.out.println("Enter matrix values : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        */
        System.out.println(count(n, m));
    }
    static int count(int n,int m){
        if(n==1||m==1) return 1;
        return count(n-1,m) + count(n,m-1);
    }
}
/*

output :
4 4
20

 */
