package P_03_BitManipulation;

public class C_06_FastExponentiation {
    public static void main(String[] args) {
        /*
        a^4 = a*a*a*a
        a^n = a*a*...*a (n times multiplication)
        time complexity ==> O(n)

        to convert this to O(logn) :
        - convert power to binary form
        - a^5 ==> a^101 = a^3

        Ex.
        3^5, ==> 3^101 ==> 3^4*3^0*3^1 ==>243
        5^3 ==> 5^011 ==> 5^0*5^2*5^1 ==> 27

         */
        System.out.println(FastExponential(3, 5)); //>> 243
    }

    static int FastExponential(int a, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {//check lsb
                ans = ans * a;
            }
            a = a * a;
            pow = pow >> 1;
        }
        return ans;
    }
}
