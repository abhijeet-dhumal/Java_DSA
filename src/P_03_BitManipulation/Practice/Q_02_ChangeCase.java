package P_03_BitManipulation.Practice;

public class Q_02_ChangeCase {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for(char ch='a';ch<='z';ch++) {
            System.out.println((char)(ch^32));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
