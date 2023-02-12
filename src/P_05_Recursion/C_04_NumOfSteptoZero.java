// package Recursion;
package P_05_Recursion;
/*
Give an integer N, the task is to
find the minimum number of moves to reduce N to 0
by one of the following operations:

Reduce N by 1.
Reduce N to (N/2), if N is divisible by 2.
 */
public class C_04_NumOfSteptoZero {
   
    public static int  res(int num , int count){                  
        if(num == 0){
            return count;
        }
        if (num %2 == 0){
            return res(num/2,count +1);
        }else return res(num-1, count+1);    
    }

    public static void main(String[] args) {
        System.out.println(res(15, 0));//>> 7
    }
   
}
