/*
   Binary AND - &
   OR - |
   XOR - ^
   One's complement - ~
   Left shift - <<   (a*2^b)
   Right Shift - >>  (a/2^b)
                                                    rem
   *Decimal to Binary (4) :(LCM)        2   |   4   (0)
                                        2   |   2   (0)
                                            |   1   (1)
                    read remainder down to up
                    Decimal(4)  == Binary(100)

   * Binary to Decimal (100) :     2^2   2^1   2^0
                                    *  +  *  +  *    = 4*1 + 2*0 + 1*0 ==> 4
                                    1     0     0

                                    Binary(100) == Decimal(4)

    * Similarly for octal and HexaDecimal


    AND (&) table  :        0   &   0   =   0
                            0   &   1   =   0
                            1   &   0   =   0
                            1   &   1   =   1

    OR (|) table  :         0   |   0   =   0
                            0   |   1   =   1
                            1   |   0   =   1
                            1   |   1   =   1

     Not (~) table (unary operator)  :

                            ~0   =   1
                            ~1   =   0

    XOR (&) table  :        0   ^   0   =   0
                            0   ^   1   =   1
                            1   ^   0   =   1
                            1   ^   1   =   0

    For example :   5   ^   6

                    1   0   1
                    1   1   0
                    _________
                    0   1   1   =>> 3

    1's complement :        Decimal(5)  =>  00000101
                            Decimal(-5) ==> 10000101

                            if( LSB ==1) ==> negative number
                            else ==> positive number

                                        whereas, MSB ==> Most Significant Bit (left most)
                                                LSB ==> Least Significant Bit (right most)

    to convert +ve to -ve number :
        We represent negative binary numbers using a minus symbol in front of them. In computer number representation,
        these numbers can be distinguishable with the help of an extra bit or flag called sign bit or sign flag in the
        Binary number representation system for signed numbers. This extra bit is called sign bit or sign flag which
        has a value of sign bit is 0 for positive numbers and 1 for negative binary numbers.

                            +ve number >> 1's complement of (+ve num)
                                        >> 2's complement of (1's complement of (+ve num))

                        1's complement of (5) :
                                    5       00000101
                                    5'      11111010

                        2's complement of (5) :
                                    (5')     11111010
                                    +1      00000001
                                    _________________
                                    (5')+1  11111011    ->>> -6 (-ve because in 1's complement MSB was 1)

            Also // Note : ~0 is -1 (~0 is not 1)

 */

package P_03_BitManipulation;

import java.util.*;

public class BitManipulations{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = 10;

        //check if num even or odd
        Even(n);  //>> Odd

        //Decimal to Binary
        System.out.println(n+"'s binary conversion is : "+decimalToBinary(n));

        //Decimal to binary
        System.out.println(n+"'s Decimal conversion is : "+BinaryToDecimal(n));
        //clear range of bits
//        System.out.println("After clearing bits from 2 to 3: "+ClearRangeOfBits(10,2,3)); //>>  2

        int position = 3; //from right to left
            //get bit(it will find a bit is 0/1) operation(AND operation)---------
        int bitMask = 1<<(position-1);
        getBit(n,position);


        //set bit(it will change 0 -> 1) operation(OR operation)----------
         int newNumber = bitMask | n;
         System.out.println("set bit operational value is : " + newNumber);


        //clear bit(it will clear any bit that means change 1 -> 0) operation(AND with NOT operation)----------
         int notBitMusk = ~(bitMask);
         newNumber = notBitMusk & n;
         System.out.println("clear bit operational value is : "+newNumber);


        //Update bit(it will update any bit to 0/1)operation
        // (for 0 ->AND with NOT operation)
        // (for 1 ->OR operation)-----------
         System.out.println("Enter operation(0/1) to Update it to 0/1 : ");
         int operation = sc.nextInt();
         updateBit(n,operation,bitMask);

    }

    static void Even(int n){
        if((n&1)==1) {
            System.out.println(n+" is Odd number");
        }else {
            System.out.println(n+" is Even number");
        }
    }
    static int decimalToBinary(int N) {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }
    static int BinaryToDecimal(int n) {
        int num = n;
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }
    static void getBit(int n,int position){
        int bitMask = 1<<(position);//position starting from 0 from right to left

        //get bit(it will find a bit is 0/1) operation(AND operation)---------
        if ((bitMask & n)==0){
            System.out.println("For num "+n+" : bitmask is "+bitMask+" and "+position +"rd positional bit is 0");
        }else{
            System.out.println("For num "+n+" : bitmask is "+bitMask+" and "+position +"rd positional bit is 1");
        }
    }

    static void updateBit(int n,int operation,int bitMask){
        int newNumber=0;
        if (operation == 1 ){
            newNumber = bitMask | n;
            System.out.println("Update bit operational value is : "+ newNumber);
        }else{
            int notBitMask = ~(bitMask);
            newNumber = notBitMask & n;
            System.out.println("Update bit operational value is : "+newNumber);
        }
    }

}

/** OUTPUT :-

 10 is Even number
 10's binary conversion is : 1010
 10's Decimal conversion is : 2
 For num 10 : bitmask is 8 and 3rd positional bit is 1
 set bit operational value is : 14
 clear bit operational value is : 10
 Enter operation(0/1) to Update it to 0/1 :


**/