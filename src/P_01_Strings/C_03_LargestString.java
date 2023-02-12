package P_01_Strings;

import java.util.Arrays;

public class C_03_LargestString {
    public static void main(String[] args) {
        //LexicoGraphically largest string
        /*
        for example :
            s1=aaabcd
            s2=aaabce

            here strings are nearly same just last char is different
            so comparison will be done wrt this last char
         */
        String s1="aaabcd";
        String s2="aaabce";
        if(s1.compareTo(s2)==0){
            System.out.println("Strings are same");
        }else if(s1.compareTo(s2)<0){
            System.out.println("Strings s1 < s2");
        }else{
            System.out.println("Strings s1 > s2");
        }

        /*
        compare to will compare 2 strings lexicographically
        but it will consider case as well
         */
        s1="aaabcd";
        s2="aaabcE";
        if(s1.compareTo(s2)==0){
            System.out.println("Strings are same");
        }else if(s1.compareTo(s2)<0){
            System.out.println("Strings s1 < s2");
        }else{
            System.out.println("Strings s1 > s2");
        }

        //to avoid this this we can use CompareToIgnoreCase
        if(s1.compareToIgnoreCase(s2)==0){
            System.out.println("Strings are same");
        }else if(s1.compareToIgnoreCase(s2)<0){
            System.out.println("Strings s1 < s2");
        }else{
            System.out.println("Strings s1 > s2");
        }

        String[] fruits={"apple","mango","banana"};
        String Largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(Largest.compareTo(fruits[i])<0){
                Largest=fruits[i];
            }
        }
        System.out.println("Lexicographically largest string among "+ Arrays.toString(fruits)+" : "+Largest);
    }
}
