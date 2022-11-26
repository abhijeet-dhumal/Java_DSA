package Extra;

import java.util.HashMap;
import java.util.Map;

public class ArraySwitchOnCommonElement {
    public static void main(String[] args) {
        int[] b={1,3,7,5,6,8};
        int[] a={4,2,7,9};
        int sum1=findSum(a,b);
        int sum2=findSum(b,a);
        System.out.println(Math.max(sum1,sum2));
    }
    static int findSum(int[] a, int[] b){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<b.length;i++){
            map.put(b[i],i);
        }
        int common=0,commonind=0;
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i])){
                common=a[i];
                commonind=i;
            }
        }
        int i=0,sum1=0;

        while(i<b.length){
            if(i<=commonind){
                sum1+=a[i];
            }else{
                sum1+=b[i];
            }
            i++;
        }
        return sum1;
    }
}
