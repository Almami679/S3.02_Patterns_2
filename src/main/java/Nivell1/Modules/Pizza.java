package Nivell1.Modules;

import Nivell1.Builder.PizzaBuilder;
import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.Enums.Toppings;


public class Pizza {

    private String name;
    private Size size;
    private Dough dough;
    private Toppings[] toppings;


    public void setName(String name) {
        this.name = name;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }


    public void setToppings(Toppings[] toppings) {
        this.toppings = toppings;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public String toString(){
        return "Pizza " + this.name + " (" + this.size +")";
    }



}
