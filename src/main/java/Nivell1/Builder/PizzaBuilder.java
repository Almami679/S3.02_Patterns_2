package Nivell1.Builder;

import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.Enums.Toppings;
import Nivell1.Modules.Pizza;

import java.util.ArrayList;

public class PizzaBuilder {

    private String name;
    private Size size;
    private Dough dough;
    private Toppings[] toppings;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public Toppings[] getToppings() {
        return toppings;
    }

    public PizzaBuilder size(Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder dough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder toppings(Toppings[] toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Pizza build(){
        Pizza pizza = new Pizza();
        pizza.setSize(getSize());
        pizza.setDough(getDough());
        pizza.setToppings(getToppings());
        pizza.setName(getName());
        return pizza;
    }



}
