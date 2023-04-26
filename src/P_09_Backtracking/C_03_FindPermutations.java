package P_09_Backtracking;

public class C_03_FindPermutations {
    public static void main(String[] args) {
        String s= "abc";
        String ans="";
        FindPermutations(s,ans);
    }
    static void FindPermutations(String s, String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            String NewStr = s.substring(0,i)+s.substring(i+1);
            FindPermutations(NewStr,ans+curr);
        }
    }

}
