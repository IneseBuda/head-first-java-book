import java.util.Scanner;

public class ExerciseSixth {

    public static void main(String[] args) {
        //Exercise 6
        //Write a program that takes from the user two integers A - a (int) and B
        //- b (int), where A <B, and then calculates the sum of the sequence of
        //numbers from A to B (A, A + 1, A + 2, ..., B) and prints it in the console.
        //When the A <B condition is not met, the program exits by writing "Job
        //completed" in the console.
        //For example, for A = 4 and B = 11, the program should write the
        //number 60 in the console.
        //Get the data from the user in the console using the Scanner class.

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please write one number:");
        int numberOne = inputReader.nextInt();
        System.out.println("Please write second number larger then first given number:");
        int numberTwo = inputReader.nextInt();
        int number=1;
        int summ;
        int summOfSequence;


        for (number = 1; numberOne < numberTwo; numberOne++) {
            summ=numberOne+number;

            //   int summOfSequence = summ+summ;
            System.out.println("Summ is:" + summ);
          //  summOfSequence = (numberOne + number) +summ;
           // System.out.println("Summ of sequence is:" + summOfSequence);

            if (numberOne > numberTwo) {
                System.out.println("Job completed!");
                break;

            }

        }
    }
}

