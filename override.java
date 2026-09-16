/*
Method overriding occurs when a child class provides its own implementation of a method that is already defined in its parent class.
private methods cannot be overridden:Because they aren't inherited by the child.
final methods cannot be overridden
static methods are not overridden:Static methods are hidden, not overridden.
Constructors cannot be overridden:Constructors are not inherited in the first place.

OVERLOADING  → Same class + different arguments
OVERRIDING   → Child changes parent's method , same parameters

why we need to write override -recommended because the compiler can detect accidental non-overriding.

Dynamic method dispatch:Dynamic Method Dispatch is the mechanism by which Java decides at runtime which overridden method to execute, based on the actual object, not the reference type.
Superclass object reference can be equal to subclass object, vice verse is not true. phone can be smartphone but smartphone cant be every phone.
Variables are resolved according to the reference type, unlike overridden methods.
 */

class A{
    int x=10;
    public int M1(){
        return 5;
    }
    public void M2(){
        System.out.println("Method 2 of class A");
    }

}
class B extends A{
    int x=20;
    @Override
    public void M2(){
        System.out.println("Method 2 of class B");
    }
    public void M3(){
        System.out.println("Method 3 of class B");
    }
}

public class override{
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        a.M2();
        b.M2();
        b.M3();

        A b2=new B(); //RUN TIME (SUPER LEFT = SUB RIGHT) baap=bacha
       // B a2=new A(); // ERROR
        b2.M2(); // OBJECT OF CHILD RUNS baap,bcha,maa
       // b2.M3(); // NOT ALLOWED baap,bcha,bandi
        System.out.println(b2.x); //Variables are resolved according to the reference type, unlike overridden methods.

    }
}