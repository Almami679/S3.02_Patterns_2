package Nivell1.Builder;

import Nivell1.Modules.Enums.Dough;
import Nivell1.Modules.Enums.Size;
import Nivell1.Modules.Enums.Toppings;
import Nivell1.Modules.Pizza;

public class PizzaBuilderVeggie extends PizzaBuilder{

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
}

