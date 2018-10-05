package reverseCopyCat;

import java.util.Scanner;

public class MultipleOfFiveAndSeven {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String anOtherNumber;

        do {
            System.out.println("Please Enter your Number");
            int myInput = userInput.nextInt();
            userInput.nextLine();

            for (int i = myInput; i >= 5; i--) {
                if (i % 5 == 0 || i % 7 == 0) {
                    System.out.println(i);
                }
            }

            System.out.println("Would you like to enter another number(y/n)");
            anOtherNumber = userInput.nextLine();
        }while(anOtherNumber.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing the game ");

    }
}
