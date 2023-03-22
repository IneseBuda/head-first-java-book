import java.util.Scanner;

public class Exercisefifth {
    public static void main(String[] args) {
        //Exercise 5
        //Write a program that takes a positive integer from the user - number
        //(int), and then prints all positive odd numbers not greater than the given
        //number in the console in order, each number in new line.
        //For example, for the number 15, the program should write in the
        //console the numbers: 1, 3, 5, 7, 9, 11, 13, 15 (in new line each)
        //Get the data from the user in the console using the Scanner class.

        Scanner inputReadr = new Scanner(System.in);

        System.out.println("Please write one odd number:");
        int givenoddNumber = inputReadr.nextInt();

        int oddNumber;
        for (oddNumber = 1; oddNumber <= givenoddNumber; oddNumber++) {
            if (oddNumber % 2 !=0)
            {
                System.out.println("Odd number is:" + oddNumber++);

            }
        }
    }
}
