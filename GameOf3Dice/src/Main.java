import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random choice = new Random();
        Scanner input = new Scanner(System.in);

        int numDice = 3, trials = 5;
        int playerPoints = 0, computerPoints = 0;

        System.out.println("Choose your target number:");
        int playerTarget = input.nextInt();

        Game player = new Game(numDice, trials);
        playerPoints = player.play("Player", playerTarget);
        int computerTarget = choice.nextInt(6) + 1; // 1 to 6

        System.out.println("Computer's target is " + computerTarget);
        Game computer = new Game(numDice, trials);
        computerPoints = computer.play("Computer", computerTarget);

        if (playerPoints > computerPoints){
            System.out.println("You win");
        }else if (playerPoints < computerPoints){
            System.out.println("Computer wins");
        }else System.out.println("Draw");
        input.close();
    }
}