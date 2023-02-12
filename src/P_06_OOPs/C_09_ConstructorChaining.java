package P_06_OOPs;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class C_09_ConstructorChaining
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    C_09_ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    C_09_ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    C_09_ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new C_09_ConstructorChaining();
        /* >>
        75
        5
        The Default constructor
         */
    }
}