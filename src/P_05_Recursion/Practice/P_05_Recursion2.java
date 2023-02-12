package P_05_Recursion.Practice;

import java.util.Arrays;
import java.util.HashSet;
public class P_05_Recursion2 {
    // Qs:-print all the subsequences of a string ===================
     public static void subsequences(String str , int idx , String newString, HashSet<String> set){
         if(idx == str.length()){
             if(set.contains(newString)){
                 return;
             }else{
                 set.add(newString);
                 return;
             }
           
         }
         char currChar = str.charAt(idx);
         subsequences(str, idx+1,newString+currChar, set);
         subsequences(str, idx+1, newString, set);
     }


     static boolean[] map1 = new boolean[26];
     public static StringBuilder removeDupPrevious(String str, StringBuilder newString){
         for(int i=0;i<str.length();i++){
             if (map1[str.charAt(i)-'a'] !=true){
                 newString.append(str.charAt(i));
                 map1[str.charAt(i)-'a'] =true;
             }
         }
         System.out.println(Arrays.toString(map1));
         return newString;

     }

    static boolean[] map2 = new boolean[26];
     static void removeDupRecursion(String str, int idx, StringBuilder newString, boolean[] map){
         if(idx == str.length()){
             System.out.println(newString);
             return;
         }
         char currChar = str.charAt(idx);
         if (map[currChar - 'a']==true){
             //duplicate
             removeDupRecursion(str, idx+1, newString, map);
         }else{
             map[currChar - 'a'] = true;
             removeDupRecursion(str, idx+1, newString.append(currChar),map);
         }
     }

    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    public static void substring(String content, String part, int index) {
        if (index >= content.length()) {
            return;
        }
        String sub = part + content.charAt(index);

        printPermutn(sub,"");

        substring(content, sub, index + 1);
    }

    public static void main(String[] args) {
        // print all subsequences
         String str = "abcde";
         HashSet<String> set= new HashSet<>();
         subsequences(str,0, "",set);
        System.out.println(set);
        //>> [, bc, de, ace, bcd, bd, acd, be, bce, acde, abde, ab, a, cd, abd, ac, bde, b, ce, abc, ade, ad, c, ae, d, abe, cde, e, abcde, bcde, abce, abcd]
        System.out.println("////////////////////");


        // print all duplicate chars
         String str2 = "bcdabdbaabcbacdbd";
        System.out.println("Removing duplicates using for loop : "+removeDupPrevious(str2,new StringBuilder()));
        //>> [true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false]
        // >> "Removing Duplicates using for loop : bcda"

        // remove duplicates using recursion
        System.out.print("Removing Duplicates using recursion : ");
        removeDupRecursion(str2, 0, new StringBuilder(""), map2);
        System.out.println();
        //>> "Removing Duplicates using recursion : bcda"

        System.out.println("////////////////////");

        //print all permutations of string- different forms with same length
        String str3 = "abb";
        System.out.print("Permutations of "+str3+" : ");
        printPermutn(str3,"");
        //>> "Permutations of abb : abb abb bab bba bab bba "
        System.out.println();

        //print all combinations of string - different forms with diffrent lengths
        System.out.print("Combinations of "+str3+" : ");
        for (int i = 0; i < str3.length(); i++) {
            substring(str3, "", i);
        }
        //>> "Combinations of abb : a ab ba abb abb bab bba bab bba b bb bb b  "
     }
}
