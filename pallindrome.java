package increment;
import java.util.Scanner;


// Q10.  Write a program to find power of a number
public class pallindrome{
    public static int pall(int num1){
        int ans=0;
        while (num1>0) {
            int rem=num1%10;
            ans*=10;
            ans+=rem;
            num1/=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        if(num1==pall(num1)){
            System.out.println("Pallindrome ");
        }
        else{
            System.out.println(" No Pallindrome ");
        }
    }
}