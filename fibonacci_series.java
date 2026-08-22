package increment;
import java.util.Scanner;

// Q4.  Write a program to print fibonacci series
public class fibonacci_series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        int num = sc.nextInt();
        int first=0;
        int second=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=num;i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}

