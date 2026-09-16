/*In Java, one .java file can have at most ONE public top-level class.
* OBJECT ORIENTED PROGRAMMING
* Solving a real world problem by creating objects is one of the most popular approaches in programming.
*  An object contains data(properties/state) and functions(behaviour/methods).It is the instantiation of a class , when a class is defined a template is defined.
* Memory is allocated only after object instantiation.
* A student fills a form providing all necessary information say -name, roll no, age, cgpa, study_hrs(),attend_class(),marks_obtained()
* Projects: noun -class, adjective-attributes, verb -actions

* Terminology :
* A class is a blueprint/template for creating objects.
* Abstraction- Hiding internal details/implementation ,showing just the relevant parts.Use mobile without bothering how it was made.
* Encapsulation-The act of putting various components(data and methods) together(in a capsule).Encapsulation is closely related to access modifiers.
* Inheritance:This allows one class to acquire properties and methods of another class.
* Polymorphism : Poly = many, Morph = forms. One interface/reference → multiple forms of behavior.
*
* Access modifier specifies where a property?method is accessible, there are four types :
* private, default, public, protected
*
 * */

class Employee{
   int id;
   String name;
   int salary;
   private int salary2;
   public void print(){
       System.out.println(" Function call -Employee name:"+name+" id: "+id+" Salary2 :"+salary2);
   }
   public int get_salary(){
       return salary;
   }
   public void set_salary2(int s){
       salary2=s;
   }
}

public class object_oriented_programming{
    public static void main(String[] args){
        System.out.println("Thi is our custom class");
        Employee emp1 = new Employee();// Instantiating new object
        Employee emp2 = new Employee();
        emp1.id=12;// setting attributes
        emp1.name="Waris";
        emp1.salary=2000;
        emp1.set_salary2(500);
//        emp1.salary2=10000; // salary is private
        emp1.print();
        System.out.println("Employee name:"+ emp1.name+" id: "+ emp1.id+" Salary: "+emp1.get_salary());
    }
}
