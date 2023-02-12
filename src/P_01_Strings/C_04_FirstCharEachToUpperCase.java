package P_01_Strings;

public class C_04_FirstCharEachToUpperCase {
    public static void main(String[] args) {
        String s=new String("hi, i am abhijeet");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(i==0){
                char c=(char)((s.charAt(i)-'a'+1)+64);
                sb.append(c);
            }
            else if(s.charAt(i)==' ' &&  i<s.length()-1){
                sb.append(s.charAt(i));
                i+=1;
                char c=(char)((s.charAt(i)-'a'+1)+64);
                sb.append(c);
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
