package P_05_Recursion;
/*

steps:
    1) Find base case
    2) Find relation between problem and sub-problem
    3) Generalise the relation

 */
public class C_01_basics {
    public static void main(String[] args) {
        System.out.println(SumOfN(10));
        System.out.println(powerOf(5,5));
    }
    static int SumOfN(int n){
        if(n==0) return 1;
        return n+SumOfN(n-1);
    }
    static int powerOf(int a, int b){
        if(b==0) return 1;
        return a*powerOf(a,b-1);
        /*
        int res=1;
        while(b>0){
            res=res*a;
            b-=1;
        }
        return res;
        */
    }
    /*

    sum(10) = 10+sum(10-1)
            = 10+9+sum(9-1)
            = 10+9+8+sum(8-1)
            ...

     */
}
/*

output :
56
3125

 */