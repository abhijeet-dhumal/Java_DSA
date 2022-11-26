package Extra;

import static java.lang.Character.*;

public class abc {
    public static void main(String[] args) {
        String a="Abc";
        String rev="";
        String output = "";
        if(isLowerCase(a.charAt(0))){
            for(int i=0;i<a.length();i++){
                if((i&1) ==0){
                    output+=toUpperCase(a.charAt(i));
                    rev+=toLowerCase(a.charAt(i));
                }
                else{
                    output+=toLowerCase(a.charAt(i));
                    rev+=toUpperCase(a.charAt(i));
                }
            }
        }else if(isUpperCase(a.charAt(0))){
            for(int i=0;i<a.length();i++){
                if((i&1)==0){
                    output+=toLowerCase(a.charAt(i));
                    rev+=toUpperCase(a.charAt(i));
                }
                else{
                    output+=toUpperCase(a.charAt(i));
                    rev+=toLowerCase(a.charAt(i));
                }
            }
        }
        output=output+"|"+rev;
        System.out.println(output);
    }
}
