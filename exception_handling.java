/*
ERROR:
1)Syntax error (variable not declared,Missing bracket,Missing semicolon
2) Logical error(Program runs successfully, but gives the wrong answer.)
3)Runtime error (also called exceptions) (Program compiles successfully, but crashes/throws an exception while running.)

Exception handling :Exception handling is a mechanism in Java used to handle runtime errors (exceptions) so that the normal flow of the program is not terminated unexpectedly.
key terms:
try	: Contains code that may cause an exception
catch : Handles the exception
finally	: Executes whether exception occurs or not
throw :	Explicitly throws an exception
throws : Declares that a method may throw an exception

syntax:
try{
     risky code}
 catch(ExceptionType e){
     handling code
 }
 finally{
     always executes
 }
Checked Exceptions:Checked by the compiler at compile time.
1)IOException
2)SQLException
3)FileNotFoundException

Unchecked Exceptions: Occur during runtime and are subclasses of RuntimeException.
   1)ArithmeticException
   2)NullPointerException
   3)ArrayIndexOutOfBoundsException
   4)NumberFormatException

finally is generally used for cleanup operations, such as closing resources.
The throw keyword is used to explicitly create and throw an exception from a specific point in the program.
throw = "I want to generate an exception here."

Throws:Used in method declaration,Tells the caller to handle/deal with it,Can declare multiple exceptions
A final variable can be assigned only once.
A final method cannot be overridden by a subclass.
Subclasses can inherit this method, but cannot change its implementation through overriding.

The finally block is normally executed whether an exception occurs or not.(ALWAYS EXECUTED)

 */

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString(){
        return "Waris here";
    }
    @Override
    public String getMessage(){
        return "Waris calling ";
    }
}

public class exception_handling {
    public static int divide(int a,int b) throws ArithmeticException{
     int result=a/b;
     return result;

    }
    public static void main(String[]args){

        try{
            int z=divide(9,0);
            System.out.println(z);
        }
        catch(Exception e){
            System.out.println(e);

        }
        finally{
            System.out.println("CONTINUE ");
        }

        System.out.println("*************************");
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("*************************");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        if(num>5){
           try{ throw new MyException();}
           catch(Exception e){
               System.out.println(e.getMessage());//getMessage
               System.out.println(e);// toString
               e.printStackTrace();
           }
        }
        else{
            throw new ArithmeticException("Small");
        }
        System.out.println("*************************");
    }
}