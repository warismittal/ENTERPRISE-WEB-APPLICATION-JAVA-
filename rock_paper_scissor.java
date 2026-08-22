import java.util.Scanner;
import java.util.Random;

public class  rock_paper_scissor{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1 = Rock, 2 = Paper, 3 = Scissors
        System.out.println("Rock Paper Scissors Game");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        // Take user's choice
        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        // Computer generates a random choice
        int computer = random.nextInt(3) + 1;

        // Display computer's choice
        System.out.println("Computer chose: " + computer);

        // Check the result
        if (user == computer) {
            System.out.println("It's a Draw!");
        }
        else if ((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }
        sc.close();
    }
}