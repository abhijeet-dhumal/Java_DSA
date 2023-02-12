package P_01_Strings;

public class C_05_StringCompression {
    public static void main(String[] args) {
        String s= new String("aaaaabbbccd");
        StringBuilder sb= new StringBuilder("");
        int cnt=0;
        for(int i=0;i<s.length();i++){
            //if i less than len(s)-1
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                cnt+=1;
            }
            //if current char not equal to next
            else if(i<s.length()-1 && s.charAt(i)!=s.charAt(i+1)) {
                cnt+=1;
                sb.append(s.charAt(i));
                if (cnt>1) {
                    sb.append(cnt);
                }
                cnt=0;
            }
            //for last index
            else{
                cnt+=1;
                sb.append(s.charAt(i));
                if(cnt>1) {
                    sb.append(cnt);
                }
            }
        }
        System.out.println(sb);
    }
}
