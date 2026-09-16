/*
* Constructors:A constructor is a special member of a class that is automatically called when an object is created. Its main purpose is to initialize the object.
*Object is born → constructor runs → object gets initial values.
*it is difficult to use set and get functions for every object created.
* constructor is automatically invoked by new.
* If you don't write any constructor, Java provides a default constructor automatically. sets name=null and roll_num =0
* If you write any constructor yourself, Java does not automatically provide the no-argument constructor.
* Parameterized Constructor:
A constructor that accepts parameters:
* Constructor Overloading:
You can have multiple constructors with different parameter lists.
*
 */
class student{
    String name;
    int roll_num;
    public student(){
    name="Invalid_name";
    roll_num=0;
    }
    public student(String s, int n){
        this.name=s;
        this.roll_num=n;
    }
    public student(String s){
        this.name=s;
        this.roll_num=0;
    }
}
public class constructors{
    public static void main(String[] args){
        student s1= new student(); // default constructor called
        student s2=new student("Waris",1024170155);
        student s3=new student("Tanishq");
        System.out.println("Name:"+s1.name+" ROLL no.:"+s1.roll_num);
        System.out.println("Name:"+s2.name+" ROLL no.:"+s2.roll_num);
        System.out.println("Name:"+s3.name+" ROLL no.:"+s3.roll_num);

    }
}