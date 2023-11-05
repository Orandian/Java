import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your paragraph:");
        String userInput = input.nextLine();
        input.close();

        userInput = userInput.trim();
        int count = 0;
        if(!userInput.isEmpty()){
            // count the first word
            // it must exist because the first character
            // must not be a space
            count++;
            for (int i = 0; i < userInput.length(); i++){
                if (userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' '){
                    // ' ?'
                    count++;
                }
            }
        }
        System.out.println("Word count: " + count);
    }
}