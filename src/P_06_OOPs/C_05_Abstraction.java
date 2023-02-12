package P_06_OOPs;

/*
Abstraction :
    -hiding unnecessary details
    - only important part is shown to user
    - can be implemented through :
        1) Abstract classes
        2) Interfaces

    1) Abstract classes : (extends keyword)
        - cannot create instance of abstract class
        - can have abstract/non-abstract methods
        - can have constructors
        - no total 100 % abstraction

    2) Interfaces  : (implements keyword)
        - interface is blueprint of class
        - used to implement multiple inheritance
        - used to achieve total abstraction 100%
        - All methods are public, abstract & without implementation
        - variables in interface are final, public and static

 */

public class C_05_Abstraction {
    public static void main(String[] args) {
        Horse badal = new Horse();
        badal.eat(); //>> "Animal eats" // method from parent AnimalAbstract
        badal.walk(); //>> "Walks on 4 legs" //method from child Horse

        Chicken sundri = new Chicken();
        sundri.eat(); //>> "Animal eats"
        sundri.walk();//>> "Walks on 2 legs"

        /*
        AnimalAbstract ans = new AnimalAbstract();
         //above line shows error as abstract class objects are not allowed
        */

        System.out.println("Initially color horse : "+badal.color + ", and Chicken : "+sundri.color);
        //>> "Initially color horse : brown, and Chicken : brown"
        badal.changeColor();
        sundri.changeColor();
        System.out.println("After abstract constructor call horse : "+badal.color+" and chicken : "+sundri.color);
        //>> "darkBrown"
        //>> "After abstract constructor call horse : DarkBrown and chicken : Yellow"

        //Check Constructor call flow
        //AnimalAbstract --> Horse --> Mustang
        Mustang myHorse = new Mustang();
        /*
        >> "AnimalAbstract constructor called
            Horse constructor called
            Mustang constructor called"
         */

    }
}

abstract class AnimalAbstract{
    String color;
    //constructor is allowed
    AnimalAbstract(){
        color = "brown";
        System.out.println("AnimalAbstract constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
    // walk method is now compulsory to be implemented by child class
}

class Horse extends AnimalAbstract{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "DarkBrown";
    }
    /*
    - here when we create object of Horse, by default color value is brown
    - once we call changeColor method, color value will be changed to dark brown
     */
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends AnimalAbstract{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

//mustang is breed of Horse
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}