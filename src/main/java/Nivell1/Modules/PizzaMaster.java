package Nivell1.Modules;

import Nivell1.Builder.PizzaBuilder;
import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.Enums.Toppings;

import java.util.ArrayList;


public class PizzaMaster {

    private String name;
    private ArrayList<Pizza> pizzas;
    private int pizzasHawai;
    private int pizzasRegi;
    private int pizzasCarn;
    private int pizzasVegg;

    public PizzaMaster(String name){
        this.name = name;
        this.pizzas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public String closeTurn(){
        return this.name + "'s turn is over\nTotal pizzas he made: [" + pizzas.size() + "]\n" +
                "Hawaian pizzas: " + this.pizzasHawai + "\n" +
                "Regina pizzas: " + this.pizzasRegi + "\n" +
                "Carnivora pizzas: " + this.pizzasCarn + "\n" +
                "Veggie pizzas: " + this.pizzasVegg;
    }

    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public void setPizzasHawai() {
        this.pizzasHawai++;
    }

    public void setPizzasRegi() {
        this.pizzasRegi++;
    }

    public void setPizzasCarn() {
        this.pizzasCarn++;
    }

    public void setPizzasVegg() {
        this.pizzasVegg++;
    }









    public void resumePizzas(){
        pizzas.forEach(pizza -> System.out.println(pizza.toString()));
    }

}
