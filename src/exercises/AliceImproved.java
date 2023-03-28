package exercises;
import java.util.Scanner;

public class AliceImproved {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String query = input.next();

        int index = text.indexOf(query);
        int length = query.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = text.replace(query, "");
        System.out.println(modifiedSentence);
    }
}