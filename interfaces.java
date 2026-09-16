/*
* An interface is a blueprint/contract that specifies what a class must do, without necessarily specifying how it does it.
* interface in english mean a point where two systems meet and interact
* interface in java are group of related methods with empty bodies
* interface bicycle{ void applyBrake(int decrement); void speedUp(int increment); } class avon_cycle implements bicycle {}
* if you have implements once an interface, you have to provide a body to functions in it must.
* why make methods public must in class?? Think of an interface as saying:
“Any class that implements me promises that this method is available to everyone.”
*
Important:
* Abstract class: Java does not support multiple inheritance of classes — a class can extend only one class.
* Interface: Java supports multiple inheritance of type — a class can implement multiple interfaces.
* Can create object directly? NO
* Constructors? NO
* Instance variables? NO
* you cant modify interfaces properties
* why multiple inheritance not allowed in java? there exist same signatures in both the super classes.but multiple interfaces are allowed.
* Default method:
* A default method is a method in an interface that has a body/implementation and is automatically available to implementing classes.
* this is one of the main reasons default methods exist: interface evolution/backward compatibility.
* Can the implementing class override it?
Yes.
*A private interface method is used as a helper method for other methods inside the same interface.
*Inheritance  in interfaces : interfaces can extend another interfaces .interface can not implement another interface, only classes can do that
* An interface can extend multiple interfaces.
* imp:
*InterfaceName ref = new ImplementingClass(); -> can only use own methods not implementing class.
*
*
* Polymorphism :Polymorphism is the ability of an object or method to take multiple forms.
* Compile-time polymorphism — Overloading
Same method name, different parameters.
* Runtime polymorphism — Overriding
*/
interface Bicycle{
    final int rate=500;
    void apply_brake(int decrement); // implicitly public abstract void..
    void speed_up(int increment);
    default void wheels(){
        System.out.println("HAVE TWO WHEELS");
    }

}
interface vehicle extends Bicycle{
    void license();
    void manufacturer();
}

class AvonCycle implements Bicycle{
    void blow_horn() {
        System.out.println("SOUND");
    }
    public void apply_brake(int decrement){
     System.out.println("Apply brake avon" );
 }
    public void speed_up(int increment){
        System.out.println("Speed up avon");
    }

}
class NovaCycle implements Bicycle{
    void blow_horn() {
        System.out.println("SOUND SOUND");
    }
    public void apply_brake(int decrement){
        System.out.println("Apply brake nova");
    }
    public void speed_up(int increment){
        System.out.println("Speed up nova");
    }
}


public class interfaces{
    public static void main(String[]args){
          AvonCycle a=new AvonCycle();
          a.speed_up(56);
          System.out.println(a.rate);
         // a.rate=600; cannot assign a value to static final variable rate
          a.wheels();// use of default keyword
          NovaCycle b=new NovaCycle();
          b.wheels();

    }
}