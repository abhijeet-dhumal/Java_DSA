package P_11_ArrayList;

import java.util.ArrayList;

public class Q_01_ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        //brutForce
        System.out.println(MaxWater(heights));

        //2 pointer approach
        System.out.println(MaxWater2Pointer(heights));
    }
    static int MaxWater2Pointer(ArrayList heights){
        int maxWater=0,height,width;
        int LeftPointer=0,RightPointer=heights.size()-1;

        while(LeftPointer<RightPointer){
            height=Math.min((int)heights.get(LeftPointer),(int)heights.get(RightPointer));
            width=RightPointer-LeftPointer;
            maxWater=Math.max(maxWater,height*width);
            if(LeftPointer<RightPointer){
                LeftPointer++;
            } else if (LeftPointer>RightPointer) {
                RightPointer--;
            }
        }
        return maxWater;
    }
    static int MaxWater(ArrayList heights){
        int maxWater = 0,height,width;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j< heights.size();j++){
                height=Math.min((int)heights.get(i),(int)heights.get(j));
                width = j-i;
                maxWater=Math.max(maxWater,height*width);
            }
        }
        return maxWater;
    }

}
