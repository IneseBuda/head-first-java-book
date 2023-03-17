import java.util.Scanner;

public class ExerciseThird {
    //Exercise 3
    //Write a program that, based on the variable: income (double), will
    //calculate the amount of personal income tax due and write it to the
    //console.
    //The tax is calculated according to the following rules:
    //• up to 85,528.00 tax is 18% of the base minus 556.02,
    //• from 85,528.00 tax is 14,839.02 + 32% of the surplus over
    //85,528.00.
    //Get the income from the user in the console using the Scanner class.
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double inCome = 85528;
        System.out.println("What is your year total income?");
        inCome = inputReader.nextDouble();
        if (inCome < 85528) {
            double personalIncomeTax = (inCome * 0.18) - 556.02;
            System.out.println("Your income Tax:" + personalIncomeTax);
        }


    }
}
