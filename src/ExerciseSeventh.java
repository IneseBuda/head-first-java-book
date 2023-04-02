import java.util.Scanner;

public class ExerciseSeventh {
    /*
    Exercise 7
Write a program that takes a positive integer N - n (int) from the user,
and then displays all powers of the number 2 in the console that are not
greater than the number given (each number should be displayed in
new line.

For example, for the number 71 the program should write in the console
the numbers: 1 2 4 8 16 32 64, in new line each.
Get the data from the user in the console using the Scanner class.
     */
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int userNumber;


        System.out.println("Write one number from 10 o 100:");
        userNumber = inputReader.nextInt();
        int number = 1;
        while (number <= userNumber


        ) {
            System.out.println(+number);
          //  number++;
            number = number * 2;
        }

        System.out.println("Done");
    }

}

