package Beginner;

/**
 *  input : if count of no. is 6 then no. will contain digits from 1-6, no digit will be repeated
 *  output :
         6 5 4 3 2 1         6 5 4 3 2 1
 digit : 6 4 5 2 3 1   =>    6 4 5 2 3 1
 **/
import Beginner.C_03_printDigits.*;

import java.util.Arrays;

import static Beginner.C_03_printDigits.count;

public class C_05_inverse {
    public static void main(String[] args) {
        int n= 81456273;
        System.out.println(inverse(n));
        System.out.println(efficientInverse(n));
    }
    static int inverse(int n){
        int m=0,i=0;
        int c=count(n);
        System.out.println(c);
        int[] arr = new int[c];
        int[] ans = new int[c];
        int div = (int) Math.pow(10,c-1);
        while(i<c){
            arr[i]=(int)(n/div);
            n%=div;
            div/=10;
            i+=1;
        }
        for(int j=0;j<arr.length;j++){
            ans[arr.length-arr[j]]=arr.length-j;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
        int res=0;
        for(int j=0;j<ans.length;j++) {
            res=res*10+ans[j];
        }
        return res;
    }
    static int efficientInverse(int n){
        int m=n;
        int c=count(m);
        int res=0;
        int divisor = (int)Math.pow(10,count(n)-1);
        while(divisor>0){
            int firstDigit=m/divisor;
            res+=count(divisor)*Math.pow(10,firstDigit-1);
            m%=divisor;
            divisor/=10;
        }
        return res;
    }
}
