package P_03_BitManipulation.Practice;
//The idea is to use XOR operators
// toswap two numbers by their property
// x ^ x = 0
public class Q_01_Swap2Num {
    public static void main(String[] args) {
        int x=3,y=4;
        System.out.println("Before swap: x = "+x+" and y = "+y);
        //swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap: x = "+x+" and y = "+y);
    }
}
/* ==>
Before swap: x = 3 and y = 4
After swap: x = 4 and y = 3
 */
