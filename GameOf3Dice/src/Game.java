import java.util.Random;
import java.util.Scanner;

public class Game {
    int numDice, trails;
    Random rand;
    Scanner input; // for "Enter" key
    public Game(int numDice, int trails){
        this.numDice = numDice;
        this.trails = trails;
        rand = new Random();
        input = new Scanner(System.in);
    }
    public int play(String who, int target){
        int[] dice = new int[numDice];
        int points = 0;

        for (int i = 0; i < trails; i++) {
            for (int j = 0; j < numDice; j++) {
                dice[j] = rand.nextInt(6) + 1; // 1 to 6
            }
        }
        System.out.println("Press Enter:");
        input.nextLine();

        for (int j : dice) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < numDice; i++) {
            if (dice[i] == target) points++;
        }
        System.out.println(who + " got "+ points + " points");
        return points;
    }
}
