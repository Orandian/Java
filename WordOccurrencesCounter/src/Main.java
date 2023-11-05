import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your passage");
        String content = input.nextLine();

        System.out.println("Enter word you want to search");
        String word = input.nextLine();
        input.close();

        Content myContent = new Content(content);
        System.out.println(word + ": " + myContent.getCount(word));
    }
}