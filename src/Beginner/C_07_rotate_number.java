package Beginner;

/**
 inputs :
    n=12340056
    k=3 where k can be -ve, greater than count(n)

 output:-  05612340

 12340056 % 1000 = 56
 **/
import static Beginner.C_03_printDigits.count;

public class C_07_rotate_number {
    public static void main(String[] args) {
        int[][] inps = {
                {27391, 2},
                {27391, -2},
                {27391,6},
                {27391,-6},
                {12340056,3}
        };
        for(int i=0;i<inps.length;i++) {
            System.out.println("Inps are : ("+inps[i][0]+","+inps[i][1]+")");
            System.out.println("My way : " + my_way_rotate_number(inps[i][0], inps[i][1]));
            System.out.println("Efficient way : "+rotate_number(inps[i][0], inps[i][1]));
            System.out.println();
        }
    }
    static int my_way_rotate_number(int n, int k){
        int m=n;
        int ans=0;
        k%=count(n);
        if (k>0){
            int div = (int) Math.pow(10,k);
            int p1= (m % div);
            m/= div;
            ans = (int)(p1*Math.pow(10,count(n)-k))+m;
        }else{
            int div = (int)Math.pow(10,count(n)+k);
            int p1 = n%div;
            m/=div;
            ans = (int)(p1*Math.pow(10,Math.abs(k))+m);
        }
        return ans;
    }

    static int rotate_number(int n,int k){
        int temp=n;
        int nod=0;
        while(temp>0){
            temp/=10;
            nod++;
        }
        k%=nod; // to handle numbers greater than count(n)

        if(k<0){
            k+=nod;  //to handle negative number eg. 23451 -2, k=-2+5=3
            // here for anticlockwise rotation we will do clockwise rotation
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div*=10;
            }else{
                mul*=10;
            }
        }
        int q=n/div;
        int r=n%div;

        r=r*mul+q;
        return r;

    }
}
