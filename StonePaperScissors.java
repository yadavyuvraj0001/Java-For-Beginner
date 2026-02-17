import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"stone", "paper", "scissors"};

        System.out.println("===== Stone Paper Scissors Game =====");

        System.out.print("Enter your choice (stone, paper, scissors): ");
        String userChoice = sc.nextLine().toLowerCase();

        int randomIndex = rand.nextInt(3);
        String computerChoice = choices[randomIndex];

        System.out.println("Computer choice: " + computerChoice);

        if(userChoice.equals(computerChoice))
        {
            System.out.println("Result: Match Draw!");
        }
        else if(userChoice.equals("stone") && computerChoice.equals("scissors"))
        {
            System.out.println("Result: You Win!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("stone"))
        {
            System.out.println("Result: You Win!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("paper"))
        {
            System.out.println("Result: You Win!");
        }
        else
        {
            System.out.println("Result: Computer Wins!");
        }

        sc.close();
    }
}
