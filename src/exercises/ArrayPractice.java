package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] newArray = {1, 1, 2, 3, 5, 8};

        //Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        System.out.println("Array contents: ");
        for(int x = 0; x < newArray.length; x++){
            System.out.println(newArray[x]);
        }

        System.out.println("Odds only contents: ");
        for(int x = 0; x < newArray.length; x++){
            if(newArray[x] % 2 != 0){
                System.out.println(newArray[x]);
            }
        }

        String quote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        //Use the split method to divide the string at each space and store the individual words in an array.

        String[] splitQuote = quote.split("\\.");
        System.out.println(Arrays.toString(splitQuote));
    }
}
