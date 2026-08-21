package increment;/* Write a program to calculate percentage of a given student in CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard. */
import java.util.Scanner;
public class exercise_CBSE_board_percentage{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of DSA");
        int m1=sc.nextInt();
        System.out.println("Enter marks of Discrete Mathematics");
        int m2=sc.nextInt();
        System.out.println("Enter marks of DBMS");
        int m3=sc.nextInt();
        System.out.println("Enter marks of Computer Networks");
        int m4=sc.nextInt();
        System.out.println("Enter marks of Operating System ");
        int m5=sc.nextInt();

        int total_marks=m1+m2+m3+m4+m5;
        float percentage= (float) (total_marks*100 /500);

        System.out.println("Percentage of student:"+percentage);

    }
}