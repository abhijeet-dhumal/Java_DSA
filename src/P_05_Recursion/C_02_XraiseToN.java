package P_05_Recursion;

public class C_02_XraiseToN {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        System.out.println(xRaiseToN(2,10));
        //>> 1024 // time complexity : O(n)

        System.out.println("Previous method execution time in nanosecs : "+(System.nanoTime()-start1));
        /*
        To find x^n in O(log(n)) time complexity
        case1 : n=even
                x^n=2^10 = x^(n/2)*x^(n/2)
                        = 2^5 * 2^5 = 2^10 = 2^10
        case2 : n=odd = 2^11
                x^n = x* x^(n/2) * x^(n/2)
                    = 2* 2^5 * 2^5 = 2^11

         */
        long start2 = System.nanoTime();
        System.out.println(xRaiseToNOptimized(2,10));
        System.out.println("Optimized function execution time : "+(System.nanoTime() - start2));
    }
    static int xRaiseToNOptimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = xRaiseToNOptimized(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        if((n&1)==1){
            //return x *xRaiseToNOptimized(x,n/2) * xRaiseToNOptimized(x,n/2);
            halfPowerSq = x*halfPowerSq;
        }
        //return xRaiseToNOptimized(x,n/2) * xRaiseToNOptimized(x,n/2);
        return halfPowerSq;
    }
    static int xRaiseToN(int x, int n){
        if(n==0){
            return 1;
        }
        return x*xRaiseToN(x,n-1);
    }

}
