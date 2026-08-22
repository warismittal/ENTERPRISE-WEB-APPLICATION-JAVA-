package increment;
import java.util.Scanner;

// Q3.	Write a program to find factorial of a number
public class factorial{
    public static void main(String[] args){
        Scanner factorial=new Scanner(System.in);
        System.out.println("Enter the character :");
        int num = factorial.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.printf("Factorial of %d is %d",num,fact);
    }
}