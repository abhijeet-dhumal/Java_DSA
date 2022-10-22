package Beginner;

public class C_03_printDigits {
    public static void main(String[] args) {
        int n= 1000;
        RightToLeft(n);
        LeftToRight(n);
    }
    static void RightToLeft(int n){
        while(n!=0){
            int lastDigit=n%10;
            System.out.print(lastDigit+" ");
            n/=10;
        }
        System.out.println();
    }
    static void LeftToRight(int n){
        int divisor = (int)Math.pow(10,count(n)-1);
        while(divisor>0){
            int firstDigit=n/divisor;
            System.out.print(firstDigit+" ");
            n%=divisor;
            divisor/=10;
        }
        System.out.println();
    }
    static int count(int n){
        int m=n;
        int c=0;
        while(m!=0){
            c+=1;
            m/=10;
        }
        return c;
    }
}
