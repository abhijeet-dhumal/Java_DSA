package P_05_Recursion;

public class C_07_recursionAdvance {
    public static void SumOfTriangle(int[] ipt , int idx){
       if(idx == 0){
        //    System.out.println(ipt[0]);
           return ;
       }
       int[] newArr =  new int [idx];
       for(int i = 0 ; i < idx; i++){
          newArr[i]=ipt[i]+ipt[i + 1];
       
         System.out.print(newArr[i] + "  ");
        }
        System.out.println();
       SumOfTriangle(newArr, idx-1);
    }

    

    public static void main(String[] args) {
        // String str = "abc";
        // printPermutation(str,"");
        
        int[] ipt = { 1 , 2 , 3 , 4 , 5 , 6 , 7};
        int n = ipt.length - 1;
        SumOfTriangle(ipt,n);        


    }
}
