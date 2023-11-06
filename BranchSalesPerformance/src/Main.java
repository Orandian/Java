import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name, including the extension:");
        String filename = input.nextLine();
        input.close();

        File myFile = new File(filename);
        input = new Scanner(myFile);

        // yearly sum for all branches
        double yearlySum = 0;

        // quarterly sum for all branches initialized to zero by default
        double[] querterlySum = new double[4];
        int count = 0;
        while (input.hasNextDouble()){
            double sales = input.nextDouble();
            yearlySum += sales;

            // quarter 0, 1, 2, and 3
            int quarter = count % 4;
            querterlySum[quarter] += sales;
            count++;
        }
        input.close();
        System.out.println(yearlySum);
        for (int i = 0; i < 4; i++) {
            System.out.println(querterlySum[i]);
        }
    }
}