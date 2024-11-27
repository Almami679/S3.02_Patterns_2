package Nivell1.Modules;

import Nivell1.Builder.PizzaBuilder;
import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.Enums.Toppings;

import java.util.ArrayList;


public class PizzaMaster {

    private String name;
    private ArrayList<Pizza> pizzas;
    private int pizzasHawai = 0;
    private int pizzasRegi = 0;
    private int pizzasCarn = 0;
    private int pizzasVegg = 0;

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

    public static Pizza makePizzaHawai(Size size, Dough dough) {
       return new PizzaBuilder()
                .size(size)
                .dough(dough)
                .toppings(new Toppings[]
                        {Toppings.TOMATO, Toppings.CHEESE,
                                Toppings.PROCCIUTO,
                                Toppings.PINEAPPLE})
               .name("Hawaiana").build();
    }

    public static Pizza makePizzaRegina(Size size, Dough dough) {
        return new PizzaBuilder()
                .size(size)
                .dough(dough)
                .toppings(new Toppings[]
                        {Toppings.TOMATO, Toppings.CHEESE,
                                Toppings.PROCCIUTO,
                                Toppings.MUSHROOMS})
                .name("Regina").build();
    }

    public static Pizza makePizzaCarnivora(Size size, Dough dough) {
        return new PizzaBuilder()
                .size(size)
                .dough(dough)
                .toppings(new Toppings[]
                        {Toppings.TOMATO, Toppings.CHEESE,
                                Toppings.PROCCIUTO,
                                Toppings.MEAT})
                .name("Carnivora").build();
    }

    public static Pizza makePizzaVeggie(Size size, Dough dough) {
        return new PizzaBuilder()
                .size(size)
                .dough(dough)
                .toppings(new Toppings[]
                        {Toppings.TOMATO, Toppings.CHEESE,
                                Toppings.OLIVES,
                                Toppings.VEGETABLES})
                .name("Veggie").build();
    }

    public void resumePizzas(){
        pizzas.forEach(pizza -> System.out.println(pizza.toString()));
    }

}
