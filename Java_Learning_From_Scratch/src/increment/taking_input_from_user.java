package increment;

import java.util.Scanner;
public class taking_input_from_user{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int sum=a+b;

       System.out.print("Sum of two numbers: ");
       System.out.println(sum);

       sc.nextLine();
       /* sc.nextLine(); consumes the leftover newline (\n) after nextInt(),
        allowing the next nextLine() to correctly read the user's string input.
       */
       System.out.println("Enter a string");
       String str= sc.nextLine();
       System.out.println(str);
    }
}