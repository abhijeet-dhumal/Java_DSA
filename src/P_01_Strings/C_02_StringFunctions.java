package P_01_Strings;
public class C_02_StringFunctions {
    public static void main(String[] args) {
        String s = "hewvdkbhsbcladsn";
        System.out.println("SubString : "+s.substring(1,s.length()-1));

        String s1="Tony";
        String s2 = "Tony";
        /*
        //interning :
        here, s1 and s2 are just reference variables present i stack memory
        pointing towards same String "Tony" present in heap memory

        To create same string again in heap memory we can use
         */
        String s3=new String("Tony");
        /*
        this will create new String object Tony in heap memory
         */

        /*
        <-String are Immutable->
        if you need to make it mutable
        can use "StringBuilder"


         */
        String st = "Tony";

        for(char ch='a';ch<='z';ch++){
            st+=ch;
        }
        System.out.println("String : "+st);
        /*
        here, as string is immutable so first in heap memory for each time Tony and respective
        char String is formed and
        reference variable st pointer moves to next string by keeping previous original string
        free without refernce which will be deleted by garbage collection
        this will take time cmplexity of O(26*n^2)
        here n^2 due to copying previous string each time, creating new string in heap memory
        and then concat
         */
        /*
        instead we can use StringBuilder,
        where additional char changes will be carried out only with single string and
        no otherstring formation is required
         */

        StringBuilder sb =new StringBuilder("Tony");
        System.out.println("StringBuilderToString : "+sb.toString());
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println("Stringbuilder : "+sb);

    }
}
