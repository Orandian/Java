import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of steps");
        int numSteps = input.nextInt();

        System.out.println("Enter step width");
        int stepWidth = input.nextInt();

        for (int i = 0; i < numSteps; i++) {
            for (int j = 0; j < (i + 1) * stepWidth; j++) {
                System.out.print("*");
            }
            // change row
            System.out.println();
        }
        input.close();
    }
}