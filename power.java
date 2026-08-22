package increment;
import java.util.Scanner;


// Q9.  Write a program to find power of a number
public class power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number, power");
        int num1 = sc.nextInt();
        int power = sc.nextInt();

        int ans=1;
        for(int i=1;i<=power;i++){
            ans=ans*num1;
        }
        System.out.printf("Power of a number %d is %d", num1 ,ans);
    }
}