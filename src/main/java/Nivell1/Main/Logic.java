package Nivell1.Main;

import Nivell1.Modules.PizzaMaster;

import static Nivell1.Main.pizzaProces.makePizza;

public class Logic {

    private static final PizzaMaster PIZZAIOLO = new PizzaMaster("Marco Carola");
    public static boolean exit = false;

    public static void start(){
        do {
            System.out.println("----------------------------------------------" +
                               "  Your pizzaiolo asigned is: " + PIZZAIOLO.getName() +
                    "  ----------------------------------------------") ;
            makePizza(PIZZAIOLO);

        }while(!exit);
        System.out.println(PIZZAIOLO.closeTurn());
    }

}
