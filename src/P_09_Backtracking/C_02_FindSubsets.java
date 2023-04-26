package P_09_Backtracking;

//Find & print all subsets() of a given string
/*
if sb="abc" : No. of subsets
                = 2^n
                = 2^ sb.length() = 2^3 = 8
                {a,b,c,bc,ab,ac,abc,''}
                where ''==empty set


 */
public class C_02_FindSubsets {
    public static void main(String[] args) {
        String str= new String("abc");
        String ans="";
        FindSubsets(str,ans,0);
        //>> abc ab ac a bc b c NULL
        System.out.println();
    }
    static void FindSubsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else {
                System.out.print(ans + " ");
            }
            return;
        }
        //yes choice
        FindSubsets(str,ans+str.charAt(i),i+1);
        //No choice
        FindSubsets(str,ans,i+1);
    }
}
