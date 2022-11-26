package Beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class C_10_pythagorian_triplet {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n=0;
        for(int i=0;i<3;i++){
            System.out.print("Enter number : ");
            n=inp.nextInt();
            arr.add(n);
        }
        System.out.println(arr.toString());
        int hyp=arr.stream().max(Integer::compare).get();
        int ad=0;
        for(int i=0;i<arr.size();i++){
            if (arr.get(i)!=(hyp)){
                System.out.println((int)Math.pow(arr.get(i),2));
                ad+=(int)Math.pow(arr.get(i),2);
            }
        }
        if (ad==(int)Math.pow(hyp,2)){
            System.out.println("Hypoteneous!");
        }else{
            System.out.println("Not hypoteneous");
        }
    }
}
