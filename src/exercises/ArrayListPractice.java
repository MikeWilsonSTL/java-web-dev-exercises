package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }
    //Write a static method to print out each word in a list that has exactly 5 letters.
    public static void fiveLetterFinder(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters: ");
        int userNum = input.nextInt();

        for(int x = 0; x < words.size(); x++){
            if(words.get(x).length() == userNum){
                System.out.println(words.get(x));
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> randomNums = new ArrayList<>();

        for(int x = 1; x < 11; x++){
            randomNums.add(x);
        }
        System.out.println("randomNums array: " + randomNums);
        int evenNumbersSum = sumEven(randomNums);
        System.out.println("sumEven results: " + evenNumbersSum);

        ArrayList<String> randomWords = new ArrayList<>();
        randomWords.add("Launch");
        randomWords.add("Code");
        randomWords.add("LaunchCode");
        randomWords.add("Cat");
        randomWords.add("Hat");
        randomWords.add("Bat");
        randomWords.add("Sat");
        randomWords.add("Bruh");
        randomWords.add("Green");
        randomWords.add("Foyer");
        randomWords.add("Apple");
        randomWords.add("We out here");
        randomWords.add("This one shouldn't work");
        randomWords.add("This one also shouldn't work");
        randomWords.add("Funny enough the word \"Five\" won't work either.");
        randomWords.add("Five only has four letters. Oh wait where was I?");
        randomWords.add("Pounce");
        randomWords.add("Hello");

        fiveLetterFinder(randomWords);
    }
}
