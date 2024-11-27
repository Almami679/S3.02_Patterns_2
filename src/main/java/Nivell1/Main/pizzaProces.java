package Nivell1.Main;

import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.PizzaMaster;

import static Nivell1.Main.Logic.exit;
import static Nivell1.Modules.Inputs.askOption;
import static Nivell1.Modules.Inputs.askPizza;
import static Nivell1.Modules.PizzaMaster.*;

public class pizzaProces {
    ;

    private static Dough selectDough(){
        Dough doughSelected;
        System.out.println("Wich one Dough?\n" +
                "[1]Cheese Stuffed\n[2]Fine\n[3]Thick\n");
        int option = askOption();
        if(option == 1) {
            doughSelected = Dough.STUFFED;
        } else if(option == 2){
            doughSelected = Dough.FINE;
        } else{
            doughSelected = Dough.THICK;
        }
        return doughSelected;
    }

    private static Size selectSize(){
        Size sizeSelected;
        System.out.println("Wich one Size?\n" +
                "[1]Small\n[2]Medium\n[3]Familiar\n");
        int option = askOption();
        if(option == 1) {
            sizeSelected = Size.SMALL;
        } else if(option == 2){
            sizeSelected = Size.MEDIUM;
        } else{
            sizeSelected = Size.FAMILIAR;
        }
        return sizeSelected;
    }

    public static void makePizza(PizzaMaster pizzaiolo){
        System.out.println("Choose the pizza:\n" +
                "[1]Hawaian Pizza       [2]Regina Pizza\n" +
                "[3]Carnivora           [4]Pizza Veggie\n" +
                "if you want to exit, press [9]");
        int pizza = askPizza();
        if(pizza == 1) {
            pizzaiolo.addPizza(makePizzaHawai(selectSize(),selectDough()));
            pizzaiolo.setPizzasHawai();
        } else if(pizza == 2){
            pizzaiolo.addPizza(makePizzaRegina(selectSize(),selectDough()));
            pizzaiolo.setPizzasRegi();
        } else if(pizza == 3){
            pizzaiolo.addPizza(makePizzaCarnivora(selectSize(),selectDough()));
            pizzaiolo.setPizzasCarn();
        } else if(pizza == 4){
            pizzaiolo.addPizza(makePizzaVeggie(selectSize(),selectDough()));
            pizzaiolo.setPizzasVegg();
        }
        if(!exit) {
            System.out.println("Pizzas in queue:");
            pizzaiolo.resumePizzas();
        }

    }


}
