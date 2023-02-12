package P_06_OOPs;
/*
2) Interfaces  : (implements keyword)
    - interface is bluprint of class
    - used to implement multiple inheritance
    - used to achieve total abstraction 100%
    - All methods are public, abstract & without implementation
    - variables in interface are final, public and static
 */
public class C_06_Interfaces {
    public static void main(String[] args) {
        /*
        ChessPlayers : Queen, Rook, Pawn, King
         */
        Queen q = new Queen();
        q.moves(); //>> "up, down, left, right, diagonal -- (in 4 directions)"

        //Multiple inheritance

        // Creating object of this class in main() method
        TestClass d = new TestClass();
        d.show();
        /*
        >> "Default PI1
         Default PI2"
         */
        System.out.println("Now Executing showOfPI1() showOfPI2()");
        //>>"Now Executing showOfPI1() showOfPI2()"
        d.showOfPI1(); //>> "Default PI1"
        d.showOfPI2(); //>> "Default PI2"
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal -- (in 4 directions)");
    }

}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right -- (by 1 step)");
    }
}

//Multiple inheritance

//Note: Java doesn’t support Multiple Inheritance
/*
on calling the method fun() using child object will cause complications
such as whether to call Parent1’s fun() or Parent2’s fun() method.

    GrandParent
     /     \
    /       \
 Parent1    Parent2
    \       /
     \     /
       Test
*/

// we have to use interfaces


// Interface 1
interface PI1 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 1
        System.out.println("Default PI1");
    }
}

// Interface 2
interface PI2 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}

// Main class
// Implementation class code
class TestClass implements PI1, PI2 {

    // Overriding default show method
    @Override
    public void show()
    {

        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show();//Should not be used directly in the main method;

        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI1
    public void showOfPI1() {
        PI1.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI2
    public void showOfPI2() {
        PI2.super.show(); //Should not be used directly in the main method;
    }

}

