package P_03_BitManipulation;

public class C_04_CheckIfPowerOf2OrNot {
    public static void main(String[] args) {
        /*
        Property :

        4 --> 100
        4-1 = 3 -->011
        4&3=0

        8 --> 1000
        8-1 = 7 -->0111
        8&7=0

        similarly for all powers of 2...
         */
        int n=8;
        System.out.println(((n&(n-1))==0) ? true : false);
    }
}
