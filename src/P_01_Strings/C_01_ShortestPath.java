package P_01_Strings;

import java.util.Scanner;

public class C_01_ShortestPath {
    public static void main(String[] args) {
        String s="WNEENESENNN";

        System.out.println(ShortestPath(s));
    }
    static int ShortestPath(String s){
        int[] ans={0,0};
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                ans[0]-=1;
            }else if(s.charAt(i)=='E') {
                ans[0] += 1;
            }else if(s.charAt(i)=='N') {
                ans[1] += 1;
            }else if(s.charAt(i)=='S') {
                ans[1] -= 1;
            }
        }
        return (int) Math.sqrt(Math.pow(ans[0],2)+Math.pow(ans[1],2));
    }
}
