/*
*Inheritance:To borrow properties and methods from an existing class.
*The extends keyword is used to create inheritance in Java. It allows one class (child/subclass) to inherit properties and methods of another class (parent/superclass).
*Constructors are not inherited, subclass(derived/child) and superclass(parent/base)
*The data, or variables, defined within a class are called instance variables.
*Constructors look a little strange because they have no return type, not even void. This is because the implicit return type of a class’ constructor is the class type itself.
*Java defines the this keyword. this can be used inside any method to refer to the current object.
*this is always a reference to the object on which the method was invoked.
*Java does not require a delete operator; memory management is automatic.
Java uses a mechanism called garbage collection, which removes objects that are no longer referenced

 Important :

 * Java first constructs the parent part of the object, then the child part.
 * base->child->grand_child order of constructor calls
 *super is a keyword in Java used to refer to the immediate parent class.
 * uses of super keyword: Access parent class variable,
Call parent class method,
Call parent class constructor
* if a child-class constructor does not explicitly call super(...), Java automatically inserts:
 * */


class base{
    int x;
    base(){
        System.out.println("BASE CLASS CONSTRUCTOR CALLED");
    }
    base(int x){
        System.out.println("BASE CLASS PARAMETERIZED CONSTRUCTOR CALLED");
        this.x=x;
    }
    public void display_b(){
        System.out.println(" VALUE : "+x);
    }
    public void square(){
        System.out.println(" Square : "+x*x);
    }

}
class derived extends base {
    int y;
    derived(){
        System.out.println("DERIVED CLASS CONSTRUCTOR CALLED");
    }
    derived(int y){
        this.y=y;
        System.out.println("DERIVED CLASS PARAMETERIZED CONSTRUCTOR CALLED");
    }
    public void display_d(){
        System.out.println(" VALUE : "+y);
    }
    public void square(){
        System.out.println(" Square : "+y*y);
    }
    public int fun(){
        return y*y;
    }
}
class derived_late extends derived{
    int z;
    derived_late(){
        super(9);
        System.out.println("DERIVED_LATE CLASS CONSTRUCTOR CALLED");
    }
    public void cube(){
        System.out.println(" cube : "+ y*super.fun());
    }

}

public class inheritance {
    public static void main(String[]args){
        base b1=new base();
        derived d1=new derived();
        System.out.println("**************************************");
        base b2=new base(8);
        derived d2=new derived(3);
        d2.x=8; // derived class can access base class x
//      b2.y=7; // base class can not access derived class y
//      b2.display_d(); // variable b2 of type base
        System.out.println("**************************************");
        b2.display_b();
        d2.display_d();
        d2.square();// derived class square called

        System.out.println("**************************************");
        derived_late dl1=new derived_late();
        System.out.println("**************************************");
        dl1.cube(); // 729 bcz we have super(y:9)


    }
}