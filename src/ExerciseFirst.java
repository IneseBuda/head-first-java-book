import java.util.Scanner;

public class ExerciseFirst {
    //Exercise 1
    //Write a program that, based on the variables: height - height (int) and
    //weight - weight (float), checks whether a person can ride a roller
    //coaster.
    //If a person is taller than 150cm and does not exceed 180kg, the
    //program will write in the console "Fasten your seatbelt!", Otherwise it
    //will write in the console "I'm sorry you can't go!".
    //Get the data from the user in the console using the Scanner class.
    public static void main(String[] args) {
        int personHeight;
        double personWeight;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("How tall are you?");
        personHeight = inputReader.nextInt();
        System.out.println("What is your weight?");
        personWeight = inputReader.nextDouble();
        if (personHeight>150 && personWeight <=180) {
            System.out.println("Fasten your seatbelt!");
        }else{
            System.out.println("I'm sorry you can't go!");
        }
    }

    }


        

        


