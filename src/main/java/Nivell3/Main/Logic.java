package Nivell3.Main;

import Nivell3.Modules.Callback;
import Nivell3.Modules.Payment;
import Nivell3.Modules.PaymentMethod;
import Nivell3.Modules.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logic {

    public static final Scanner INPUT = new Scanner(System.in);

    private static ArrayList<Product> cart = new ArrayList<>(Arrays.asList(
            new Product("Mause Corsair M65 Pro", 128.56),
            new Product("Keyboar RK-68 Mecanic", 64.56)));



    public static void innit() {

        showCart();
        System.out.println("Total price: " + totalPrice() + "€");

        Payment payment = selectOption(totalPrice());
        payment.pay();

    }

    private static Payment selectOption(double price){
        Payment payment = null;
        System.out.println("Select your Pay Method:\n[1]Credit Card     [2]Bizum        [3]Gift Card");
        do{
        switch(INPUT.nextInt()) {
            case 1:
                payment = new Payment(PaymentMethod.CREDIT_CARD, price);
                break;
            case 2:
                payment = new Payment(PaymentMethod.BIZUM, price);
                break;
            case 3:
                payment = new Payment(PaymentMethod.GIFT_CARD, price);
                break;
            default:
                System.out.println("Please select a correct option.");

            }
        }while(payment == null);
        return payment;
    }

    private static void showCart(){
        System.out.println("Your cart:\n··········");
        cart.forEach(System.out::println);
    }

    private static double totalPrice(){
        double price = 0;
        for (Product product : cart) {
            price += product.getPrice();
        };
        return price;
    }
}
