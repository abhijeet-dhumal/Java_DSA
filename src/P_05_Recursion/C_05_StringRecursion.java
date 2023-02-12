package P_05_Recursion;

import java.util.HashSet;

public class C_05_StringRecursion {
    public static void main(String[] args) {
        String s= "abcdcba";
        int l=0,r=s.length()-1;
        System.out.println("IsPallindrome "+s+": "+pallindrome(s,l,r));

        StringBuilder s1= new StringBuilder("abc");
        String cur="";
        int i=0;
        HashSet set=new HashSet<>();
        System.out.println("Combinations "+s1+": "+powerset(set,s1,i,cur));
        System.out.print("Permutations "+s1+": ");
        permutations(s1,0,s1.length()-1);
    }
    static void permutations(StringBuilder s, int l, int r){
        if(l==r){
            System.out.print(s+" ");
            return;
        }
        for(int i=l;i<=r;i++){
            swap(s,l,i);
            permutations(s,l+1,r);
            swap(s,l,i);
        }
    }
    static void swap(StringBuilder str, int i, int j)
    {
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }
    static HashSet powerset(HashSet set,StringBuilder s, int i, String cur){
        if(i==s.length()){
            set.add(cur);
            return set;
        }
        powerset(set,s,i+1,cur+s.charAt(i));
        powerset(set,s,i+1,cur);
        return set;
    }
    static boolean pallindrome(String s, int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return pallindrome(s,l+1,r-1);
    }
}
