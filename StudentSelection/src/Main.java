import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);

        System.out.println("Enter number of students");
        int numStudents = input.nextInt();

        String[] student = new String[numStudents];
        int[] age = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name: ");
            student[i] = nameInput.nextLine();

            System.out.println("Enter age: ");
            age[i] = ageInput.nextInt();
        }

        for (int i = 0; i < numStudents; i++) {
            if (age[i] >= 15){
                System.out.println(student[i] + " can receive a vaccine.");
                System.out.println("The student is now " + age[i]);
            }
        }

        input.close();
        nameInput.close();
        ageInput.close();
    }
}