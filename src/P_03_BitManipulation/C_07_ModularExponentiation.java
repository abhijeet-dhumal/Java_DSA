package P_03_BitManipulation;

public class C_07_ModularExponentiation {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int p = 13;

        int mod = power(x, y, p);
        System.out.print("Power is " + mod);
    }
    static int power(int a, int pow, int p)
    {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {//check lsb
                ans = ans * a;
            }
            a = a * a;
            pow = pow >> 1;
        }
        return ans%p;
    }
}
