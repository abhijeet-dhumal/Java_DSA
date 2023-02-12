package P_03_BitManipulation;

public class C_03_ClearRangeOfBits{
    public static void main(String[] args) {
        int n=2515,i=2,j=7;
        /*
        2515 = 100111010011 (12 bit number)
       indices - 9876543210
                   _    _
               111100000011 (required bitMask)

         */
        int a= (-1)<<j+1;
        // 111111111111<<8 ==> 111100000000
        int b= (int)(Math.pow(2,i)-1);
        /*
        as 01 ==> 2^1-1
           011 ==> 2^2-1
         */
        int bitMask = a|b;  //  111100000011

        System.out.println(n&bitMask);  // 100100000011
    }
}
