package org.launchcode.java.studios.areaofacircle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        try {
            double radius = input.nextDouble();
            while(radius < 0){
                System.out.println("Please enter a positive number. Try again:");
                radius = input.nextDouble();
            }
            System.out.println("The area of a circle with a radius of " + radius +
                    " is: " + Circle.getArea(radius));
        } catch(InputMismatchException e) {
            System.out.print("Invalid input. Re-start program.");
        }
    }
}
