package increment;
import java.util.Scanner;


// Q7.  Write a program to fid digits in an integer
public class digits_in_a_integer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        int ans=0;
        while (num1>0) {
            num1/=10;
            ans++;
        }
        System.out.printf("Ans %d", ans);
    }
}