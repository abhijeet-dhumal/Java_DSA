package P_06_OOPs;

public class C_07_Static {
    public static void main(String[] args) {
        StudentStatic abhi = new StudentStatic();
        abhi.SchoolName = "JMV";

        StudentStatic ak = new StudentStatic();
        System.out.println(ak.SchoolName); //>>"JMV"
        // We changed static variable SchoolName for abhi object but changed for ak as well

        StudentStatic ma = new StudentStatic();
        ma.SchoolName="NMIET";
        System.out.println(ma.SchoolName + " "+abhi.SchoolName+" "+ak.SchoolName);
        //>> NMIET NMIET NMIET
        /*
        static variable will be stored separately than created objects
        and will be same for all objects
         */
    }
}
class StudentStatic{
    String name;
    int roll;

    static String SchoolName;
    /*
    - if this variable changes for any one object
        it will be changed for all other objects
    - instead for creating SchoolName string for each student,
        we can store SchoolName separately and then
        objects will be pointing to  same object through static
    */
    void setName(String name){
        this.name = name;
    }
    void  getName(){
        System.out.println(this.name);
    }
    static int percentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    /*
    This percentage functionality same for all objects
    hence can be used as static function
    This will avoid multiple executions stored in memory
    as this function will not get repeated object by object
     */
}