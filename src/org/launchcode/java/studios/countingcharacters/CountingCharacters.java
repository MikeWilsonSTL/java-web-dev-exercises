package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class CountingCharacters {
    public static HashMap characterCounter(char[] characters) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int x = 0; x < characters.length; x++){
            if(!characterCount.containsKey(characters[x])){
                characterCount.put(characters[x], 1);
            }
            else{
                characterCount.put(characters[x], (characterCount.get(characters[x]) + 1));
            }
        }
        return characterCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File textFile = new File("C:\\Users\\Mike\\Desktop\\Projects\\LC101 Unit 2\\Chapter 1\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\text-file.txt");
        String contents = new Scanner(textFile).useDelimiter("\\Z").next();
        System.out.println("Enter a string to track all characters or hit Enter to read local file: ");
        String userInput = input.nextLine();

        if(Objects.equals(userInput, "")){
            contents = contents.replaceAll("[^a-zA-Z0-9]", "");
            char[] charactersInFile = contents.toUpperCase().toCharArray();
            System.out.println(characterCounter(charactersInFile));
        }
        else{
            userInput = userInput.replaceAll("[^a-zA-Z0-9]", "");
            char[] charactersInString = userInput.toUpperCase().toCharArray();
            System.out.println(characterCounter(charactersInString));
        }
    }
}
