/*
Introduction to function/method in java
based on DRY principle - do not repeat yourself
method is a function written inside a class since
java is an object-oriented language ,
we need to write a method inside some class.

dataType name(parameters){
function body}

Static keyword is used to associate a method of a given class with the class rather than the object
static method in a clas is shared by all the objects.
imp:
In case of arrays, the reference is passed , Same is the case for object passing to methods.

Method overloading : multiple methods with the same name but different parameter lists in the same class.
vip=Overloading = same name + different parameter list.
Return type alone cannot overload a method.
*/

import java.util.Scanner;
import java.util.Scanner;
public class functions_intro{
    static int addition(int a,int b){// can be accessed only when you don't want to create an object
        return a+b;
    }
   int multiplication(int a,int b){// values of a and b are derived from main function and won't affect the values in main function
        System.out.println("The product is: "+(a*b));
        return a*b;
    }
    int multiplication(int a){// method overloading
        System.out.println("The product via method overloading is: "+(a*a));
        return a*a;
    }
    public static void main(String[] args){  // why static? This method belongs to the class itself, not to any particular object.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=addition(a,b);
        System.out.println("The sum is: "+sum);
        functions_intro obj=new functions_intro(); //object creation
        int c=obj.multiplication(a,b); // function call
        System.out.println("Product via variable call:"+c);
        obj.multiplication(a); // method overloading

        System.out.println("Enter the number values");
        int n=sc.nextInt();
        int[] marks=new int[n];

        System.out.println("Enter the values");

        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Values are");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }

    }
}