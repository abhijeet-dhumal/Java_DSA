package P_06_OOPs;

public class C_03_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        //single level : Animal --> Fish
        shark.eat(); // >> "eats"

        //multi level : Animal --> Mammal --> Dog
        Dog puppy = new Dog();
        puppy.eat(); // Animal class property method
        puppy.legs=4; // Mammal class attribute
        System.out.println(puppy.legs); // >> 4

        // hierarchial
        Mammal elephant = new Mammal();
        Bird sparrow = new Bird();
        elephant.walk(); // >> "Walks"
        sparrow.fly(); // >> "Fly"
        shark.swim();// >> "Swims in water"

        // Hybrid
        // Multiple -- > Not applicabe in Java directly
    }
}

// Parent or base class
class Animal{
    String color ;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Chid or derived class
// * Single Level Inheritance
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

//* Multilevel inheritance
class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
    int teeth;
    String breed;
}

// hierarchial inheritance
class Bird extends Animal{

    void fly(){
        System.out.println("Fly");
    }
}