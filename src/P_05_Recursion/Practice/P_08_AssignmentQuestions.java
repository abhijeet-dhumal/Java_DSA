package P_05_Recursion.Practice;

import java.util.Vector;

public class P_08_AssignmentQuestions {
    public static void main(String[] args) {
        /* Q1
        For a given integer array of size N.
        You have to find all the occurrences
        (indices) of a given element (Key)
        and print them.
        Sample Input:
            arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
            key = 2
            Sample Output: 1 5 7 8
         */
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        System.out.print("All occurences of key are at indices : ");
        printOccurences(arr,key,0);
        System.out.println();

        /* Q2
        We are given a string S,
        we need to find the count of all
        contiguous substrings starting
        and ending with the same character
         Sample Input 1:
         S = "abcab"
         Output 1: 7
         */
        String s = "abcab";
        Vector<String> set = new Vector<>();
        System.out.println();

        for (int i = 0; i < (int)s.length(); i++)
        {
            String ans = "";
            for (int j = i; j < (int)s.length(); j++)
            {
                ans += s.charAt(j);
                set.add(ans);

                }

        }
        System.out.println("All possible contiguous combinations of '"+s+"' : "+ set + " and length is : "+set.size());
        System.out.print("Substrings starting and ending with same char are : ");
        int cnt=0;
        for(String ele : set) {
            // Print HashSet data
            if(ele.charAt(0)== ele.charAt(ele.length()-1)) {
                System.out.print(ele + " ");
                cnt++;
            }
        }
        System.out.println("Count of substrings : "+cnt);

        // same above operation can be done recursively using recursion
        System.out.println("\nCount of substrings using recursion: "+countSubstrs(s,0,s.length()-1,s.length()));


        // Q3  Tower of hanoi problem
        int n=3;
        towerOfHanoi(n,"A","B","C");
    }

    public static void towerOfHanoi(int n,String src,String helper,String dest) {
        /*
        Note : 1) only 1 disk can be transferred in 1 step
            2) smaller disks should be kept on the larger disks
         */
        if(n==1) {
            System.out.println("transfer disk"+n+" from "+src+" to "+dest);
            return;
        }//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1,src,dest,helper);
        //transfer nth from src to dest
        System.out.println("transfer disk"+n+" from "+src+" to "+dest);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static int countSubstrs(String str,int i,int j,int n) {
        if(n==1) {
            return 1;
        }if(n<=0) {
            return 0;
        }
        int res=countSubstrs(str,i+1,j,n-1)+
                countSubstrs(str,i,j-1,n-1)-
                countSubstrs(str,i+1,j-1,n-2);
        if(str.charAt(i) ==str.charAt(j)) {
            res++;
        }
            return res;
    }
    static void printOccurences(int[] arr, int key, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==key) {
            System.out.print(index+" ");
        }
        printOccurences(arr,key,index+1);
    }
}
