package P_06_OOPs;

import java.util.Arrays;

/*
Types of constructors :
    1) Non parameterized,
    2) Parameterized
    3) Copy Constructor

 Shallow and Deep copy :
    1) Shallow --> Changes reflect
    2) Deep    --> Changes do not reflect
 */
public class C_02_Constructors {
    public static void main(String[] args) {
        // Constructor Overloading -->
        StudentCls s1 = new StudentCls("Abhijeet");
        StudentCls s2 = new StudentCls();
        StudentCls s3 = new StudentCls("Akshay",9);
        /* >>
        Name parameter constructor is called ...
        Null parameter constructor is called ...
        Name and roll parameter constructor is called ...
        */

        //Copy constructor
        s1.roll=456;
        s1.password="abcde";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        // now if s1 forgets his password
        StudentCls s4=new StudentCls(s1);
        s4.password="xyz";
        //object s1's properties are copied to s4 object

        System.out.println("Before change in s1 : "+Arrays.toString(s4.marks));
        //if we change s1 marks
        s1.marks[0]=70;
        System.out.println("After change in s1 : "+Arrays.toString(s4.marks));
        /*  Shallow copy constructor output
        Before change in s1 : [100, 90, 80]
        After change in s1 : [70, 90, 80]
        */
        //here as s1 marks changes, s4 marks also changes which should not happen

        // so to avoid this we can use deep  copy constructor
        /*  Deep copy constructor output
        Before change in s1 : [100, 90, 80]
        After change in s1 : [100, 90, 80]
        */
    }

}

class StudentCls{
    String name,password;
    int roll;
    int[] marks;
    // * Constructor overloading==> Polymorphism
    StudentCls(){
        marks=new int[3];
        System.out.println("Null parameter constructor is called ...");
    }
    StudentCls(String name){
        marks=new int[3];
        this.name=name;
        System.out.println("Name parameter constructor is called ...");
    }
    StudentCls(String name, int roll){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        System.out.println("Name and roll parameter constructor is called ...");
    }

    /*
    // Object as a parameter
    //object s1's properties are copied to s4 object
    // Shallow copy constructor - changes reflect
    StudentCls(StudentCls s1){
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        this.marks=s1.marks;
        // here s1 marks are not copied to s4 marks
        // the reference of s1 marks is copied to s2 marks
        //to avoid this we shoud know about shallow and deep copy
    }
    */


    //deep copy constructor - No changes reflect
    StudentCls(StudentCls s1){
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
