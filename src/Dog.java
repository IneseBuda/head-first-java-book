import java.util.Scanner;

public class Dog {

    String bark;
    String play;


    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
          int x;

        Scanner inputReader = new Scanner(System.in);

        Dog myDog = new Dog();
        System.out.println("Write a number");
        size=inputReader.nextInt();
        //myDog.bark();
        x = size - 5;
        if (x < 15) myDog.bark();
        while (x > 3) {
            myDog.play();
        }
        int[] numList = {2, 4, 6, 8};
        System.out.print("Hello");
        System.out.print("Dog: " + name);
        String num = "8";
        int z = Integer.parseInt(num);
       // try {
       //     readTheFile("myFile.txt");
        //} catch (FileNotFoundException ex) {
            System.out.print("File not found.");
        }
  //  }

    private void play() {
    }

    private <int8> void bark() {

    }
}