package Nivell1.Modules;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Nivell1.Main.Logic.exit;

public class Inputs {

    private static final Scanner INPUT = new Scanner(System.in);

    public static int askOption() {
        int output = 0;
        do {
            System.out.println("select your option...");
            try {
                output = INPUT.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("enter a right number please");
            } finally {
                INPUT.nextLine();
            }
        } while(output <= 0 || output > 3 && output != 9);
        if (output == 9){
            exit = true;
        }
        return output;
    }

    public static int askPizza() {
        int output = 0;
        do {
            System.out.println("select your option...");
            try {
                output = INPUT.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("enter a right number please");
            } finally {
                INPUT.nextLine();
            }
        } while(output <= 0 || output > 4 && output != 9);
        if (output == 9){
            exit = true;
        }
        return output;
    }

}
