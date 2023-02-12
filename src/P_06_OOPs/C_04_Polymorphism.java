package P_06_OOPs;

public class C_04_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // * Method Overloading
        /* (static - compile time)
        same function name
        different count or types of arguments
         */
        System.out.println(cal.sum(4,5)); //>> 9
        System.out.println(cal.sum((float)4.5, (float)5.0)); //>> 9.5
        System.out.println(cal.sum(3,4,5)); // >> 12

        // * Method overriding
        /* (dynamic- run time)
        same function name
        same arguments
        different definition or functionality
         */
        Deer sona = new Deer();
        sona.eat();// >> "eats grass"
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

class AnimalCls{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends AnimalCls{
    void eat(){
        System.out.println("eats grass");
    }
}