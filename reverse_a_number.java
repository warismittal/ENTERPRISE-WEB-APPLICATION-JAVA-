package increment;
import java.util.Scanner;


// Q8.  Write a program to reverse a number
public class reverse_a_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        int ans=0;
        while (num1>0) {
            int rem=num1%10;
            ans*=10;
            ans+=rem;
            num1/=10;
        }
        System.out.printf("Reverse number %d", ans);
    }
}