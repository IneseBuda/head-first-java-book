import java.util.Scanner;

public class ExerciseSeventh {
    /*
    Exercise 7
Write a program that takes a positive integer N - n (int) from the user,
and then
 (each number should be displayed in
new line.
For example, for the number 71 the program should write in the console
the numbers: 1 2 4 8 16 32 64, in new line each.
Get the data from the user in the console using the Scanner class.
     */
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int userNumber;

       int mult=1;
        int result;
int number;

        System.out.println("Write one number from 10 o 100:");
        userNumber = inputReader.nextInt();

        for (
                number = mult*2;
                number<=userNumber;
               number++
               )

        {
            System.out.println(+number );
        }
        while (number <= userNumber) ;
        {
            System.out.println("Done");
        }

    }
}

