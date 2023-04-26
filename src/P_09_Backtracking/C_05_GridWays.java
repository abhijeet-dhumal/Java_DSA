package P_09_Backtracking;

/*
    In 2D grid system, in how many ways
    left topmost grid value can passed to
    right bottom most grid
    | O |   |   |
    |   |   |   |
    |   |   | * |

    Simple ways is to find with -
    (Permutation)

    way/path ==> (n-1)D, (m-1)R
    { D,D,D,D  -->(n-1)
    R,R,R,R,R } --> (m-1)

    total chars ==> (n-1+m-1)
    repeating chars --> D=(n-1)
                        R=(m-1)

    So, Total No. of ways == ((n-1+m-1)!) / ((n-1)!*(m-1)!)
                ==> (3-1 + 3-1)! / ((3-1)! * (3-1)!)
                --> 6 (No. of ways)
* */

public class C_05_GridWays {
    public static void main(String[] args) {
        int n=3,m=3;
        // very bad time complexity O(2^(n+m))
        System.out.println(FindWays(0,0,n,m));

        // Mathematic way to solve in linear time
        System.out.println(FindWaysLinear(n,m));
    }
    static int FindWaysLinear(int n,int m){
        int NumOfChars = permutation(n-1+m-1);
        int repeatedD = permutation(n-1);
        int repeatedR = permutation(m-1);
        return (NumOfChars/(repeatedD*repeatedR));
    }
    static int FindWays(int i, int j, int n, int m){

        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        int w1=FindWays(i+1,j,n,m);
        int w2 = FindWays(i,j+1,n,m);
        return w1+w2;
    }
    static int permutation(int n){
        if(n==0){
            return 1;
        }
        return n*permutation(n-1);
    }
}
