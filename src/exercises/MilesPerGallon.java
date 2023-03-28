package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("MPG Calculator");
        System.out.println("==============");
        System.out.println("Enter the number of miles travelled: ");
        int miles = input.nextInt();
        System.out.println("Enter the number of gallons used: ");
        int gallons = input.nextInt();
        System.out.println("You averaged " + (miles/gallons) + " miles per gallon!");
    }
}
