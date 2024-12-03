package Nivell3.Main;

import Nivell3.Modules.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logic {

    public static final Scanner INPUT = new Scanner(System.in);

    private static ArrayList<Product> cart = new ArrayList<>(Arrays.asList(
            new Product("Nike Air Jordan", 128.56),
            new Product("Adidas Samba (Black)", 64.56)));



    public static void innit() {

        Store store = new Store();

        showCart();
        System.out.println("Total price: " + totalPrice() + "€");

        Payment payment = selectOption(totalPrice());

        store.callValidatePayment(payment);

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
