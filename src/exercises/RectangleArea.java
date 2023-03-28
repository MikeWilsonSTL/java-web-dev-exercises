package exercises;
import java.util.Objects;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Rectangle Area Calculator");
    System.out.println("Enter the length of the rectangle:");
    int length = Integer.parseInt(input.nextLine());
    System.out.println("Enter the width of the rectangle:");
    int width = Integer.parseInt(input.nextLine());
    if(Objects.equals(length, width)){
        System.out.println("Ooh! A square! □");
    }
    System.out.println("Enter a third number for no reason:");
    String thirdNum = input.nextLine();

    System.out.println("The area of the rectangle is: " + (length * width));
    System.out.println("The third number you submitted was: " + thirdNum);
    }
}
