package increment;
import java.util.Scanner;

// Q1. WAP to check a leap year
public class conditionals{
    public static void main(String[] args){
   Scanner leap_year=new Scanner(System.in);
   System.out.println("Enter year :");
   int year=leap_year.nextInt();
   if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
       System.out.printf("%d is a leap year \n",year);
   }
   else{
           System.out.printf("%d is not a leap year \n",year);
   }
    }
}


