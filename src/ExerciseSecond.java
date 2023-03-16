import java.util.Scanner;

public class ExerciseSecond {
    //Exercise 2
//Write a program that based on the variable temperature in degrees
//Celsius - tempInCelsius (float), will calculate the temperature in degrees
//Farhenheit (degrees Fahrenheit = 1.8 * degrees Celsius + 32.0) and write
//it in the console.
//Get the temperature from the user in the console using
//the Scanner class.
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double tempInCelsius;

        System.out.println("Degrees in Celsium:");
        tempInCelsius = inputReader.nextDouble();
        System.out.println( " Fahrenheit = " + (1.8 * tempInCelsius));


    }
}

