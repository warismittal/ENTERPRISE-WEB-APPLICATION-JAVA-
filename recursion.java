import java.util.Scanner;

public class recursion{
    static int helper(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*helper(n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int num=helper(n);
        System.out.println(num);

    }
}