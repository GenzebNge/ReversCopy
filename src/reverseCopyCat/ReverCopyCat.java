package reverseCopyCat;

import java.util.Scanner;

public class ReverCopyCat {

    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String anOtherNumber;

    do{

        System.out.println("Please Enter your number?");
        int myNumber = userInput.nextInt();
        userInput.nextLine();

        for (int n = myNumber; n >= 1; n--) {

                if(n%5==0){
                    System.out.println("copy");
                }else if (n%7 == 0){
                    System.out.println("Cat");
                }else {
                    System.out.println(n);
                }
            }

        System.out.println("1");
        System.out.println("Would you like to enter another number(y/n)");
        anOtherNumber = userInput.nextLine();

     }while (anOtherNumber.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing the game");
   }
}