package P_03_BitManipulation;

public class C_02_ClearLastIBits {
    public static void main(String[] args) {
        int n=15;
        int i=2;
        /*
        clear last 2 bits of 17(1111)  == > 1100
         */
        int bitMask = (-1)<<i;  // -1 == ~0 in binary is 11111111
        System.out.println(bitMask);
        System.out.println(n&bitMask);
    }
}
