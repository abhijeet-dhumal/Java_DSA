package P_06_OOPs;

public class C_08_Super {
    public static void main(String[] args) {
        HorseSuper badal = new HorseSuper();
        /* >>
        "Animal constructor called
        Horse constructor called"
         */
        System.out.println(badal.color); //>> "brown"
    }
}
class AnimalSuper{
    String color;
    AnimalSuper(){
        System.out.println("Animal constructor called");
    }
}
class HorseSuper extends AnimalSuper{

    HorseSuper(){
        super(); // this will call immediate parent class AnimalSuper class constructor
        /*
        if we don't mention super here
        then also output will be same
        as it will by default call super() here;
        */
        super.color = "brown";
        System.out.println("Horse constructor called");

    }
}