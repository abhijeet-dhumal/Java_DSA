
/*
print all binary strings of size n without consecutive 1's
n size sofa (n numbers can sit) = ___...n
 */
package P_05_Recursion.Practice;

public class P_07_BinaryStringsProblem {
    public static void main(String[] args) {
        printBinaryStrings(3,0, "");
        /*>>
        000
        001
        010
        100
        101
         */
    }
    static void printBinaryStrings(int n,int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1,0,str+"0");
        if(lastPlace ==0){
            // str.append("0");
            // sit 0 on chair

            printBinaryStrings(n-1,1,str+"1");
        }
    }
}
/*
Stack Analysis :

| n=0, LP=0, "000"| => prints(str) and then get erased -- 000
| n=1, LP=0, "00"|
| n=2, LP=0, "0"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------

| n=0, LP=1, "001"| => prints(str) and then get erased
| n=1, LP=0, "00"|
| n=2, LP=0, "0"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------

| n=0, LP=1, "001"| => prints(str) and then get erased -- 001
| n=1, LP=0, "00"| ==> gets erased
| n=2, LP=0, "0"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------

| n=0, LP=0, "010"| => prints(str) and then get erased -- 010
| n=1, LP=1, "01"|
| n=2, LP=0, "0"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------

| n=0, LP=0, "100"| => prints(str) and then get erased -- 100
| n=1, LP=0, "10"|
| n=2, LP=1, "1"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------

| n=0, LP=1, "101"| => prints(str) and then get erased -- 101
| n=1, LP=0, "10"|
| n=2, LP=1, "1"|
| n=3, LP=0, "" |
| n=3, LP=0, "" |
-----------------


 */