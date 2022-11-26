/**
 *  Binary AND - &
 *  OR - |
 *  XOR - ^
 *  One's complement - ~
 *  Left shift - <<   (a*2^b)
 *  Right Shift - >>  (a/2^b)
 *
 * **/


package P_07_BitManipulation;

import java.util.*;

public class BitManipulations{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int n = sc.nextInt();
        if(Even(n)) System.out.println("Even number");
        else System.out.println("Odd number");
        System.out.println("Enter position : ");
        int position = sc.nextInt();
        int bitMask = 1<<position;

        //clear range of bits
        System.out.println(ClearRangeOfBits(10,2,4));

        //get bit(it will find a bit is 0/1) operation(AND operation)---------
         if ((bitMask & n)==0){
             System.out.println(position +" positional bit is 0");
         }else{
             System.out.println(position+" positional bit is 1");
         }


        //set bit(it will change 0 -> 1) operation(OR operation)----------
         int newNumber = bitMask | n;
         System.out.println("set bit operational value is : " + newNumber);


        //clear bit(it will clear any bit that means change 1 -> 0) operation(AND with NOT operation)----------
         int notBitMusk = ~(bitMask);
         newNumber = notBitMusk & n;
         System.out.println("clear bit operational value is : "+newNumber);


        //Update bit(it will update any bit to 0/1)operation(for 0 ->AND with NOT operation)(for 1 ->OR operation)-----------
         System.out.println("Enter operation(0/1) to Update it to 0/1 : ");
         int operation = sc.nextInt();
         if (operation == 1 ){
             newNumber = bitMask | n;
             System.out.println("Update bit operational value is : "+ newNumber);
         }else{
             notBitMusk = ~(bitMask);
             newNumber = notBitMusk & n;
             System.out.println("Update bit operational value is : "+newNumber);
         }

    }
    static boolean Even(int n){
            if((n&1)==1) {
                return false;
            }
            return true;
    }
    static int ClearRangeOfBits(int n, int i,int j){
            int a=((~0)<<(j+1));
            int b = (1<<i)-1;
            int bitMask = a|b;
            return n & bitMask;
    }
}

/** OUTPUT :-
 Enter a integer value :
 5
 Odd number
 Enter position :
 1
 1 positional bit is 0
 set bit operational value is : 7
 clear bit operational value is : 5
 Enter operation(0/1) to Update it to 0/1 :
 1
 Update bit operational value is : 7

**/