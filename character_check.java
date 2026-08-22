package increment;
import java.util.Scanner;

// Q2.	Write a program to check whether a character is an alphabet or not
public class character_check{
    public static void main(String[] args){
        Scanner character=new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = character.next().charAt(0);
        if((ch>='A' && ch<='Z') || (ch >= 'a' && ch<= 'z')){
            System.out.printf("%c is an alphabet. \n",ch);
        }
        else{
            System.out.printf("%c is not an alphabet. \n",ch);
        }
    }
}