import java.util.Scanner;

public class ExerciseEight {
    /*
    Exercise 8
    Write a program that takes numbers from the user as long as the
    number 0 is not given. When the number 0 is given, the program
    calculates the sum of the numbers given and prints it in the console.
    For example, for a series of given numbers: 3, 2, 5, 1, 0, the program
    should write the number 11 in the console.   Get the data from the user
    in the console using the Scanner class.

     */
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Play game with me!");

       int userNumber, sum;
      //  sum=userNumber*(1+userNumber)/2;
        do{
           System.out.println("Please write the number from 1 to 50");
           userNumber=inputReader.nextInt();

       }while(userNumber!=0);

      //  System.out.println("Your given number sum is:"+ sum);



    }
}

