package P_01_Array.P_01_BasicArray;

import java.util.ArrayList;

public class C_04_PairsInArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        PrintPairs(arr);
    }
    static void PrintPairs(int[] arr){
        int fst=0,scnd=0;

        while(fst<arr.length){
            scnd=fst+1;
            while(scnd<arr.length) {
                System.out.print("("+arr[fst] + "," + arr[scnd]+") ");
                scnd+=1;
            }
            System.out.println();
            fst+=1;
        }
    }
}
