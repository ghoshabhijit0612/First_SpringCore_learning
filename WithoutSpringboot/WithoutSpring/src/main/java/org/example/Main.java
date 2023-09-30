package org.example;
import ConfigClass.configg;
import org.example.Product.Account;
import org.example.Product.Cart;
import org.example.Product.Payment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       ApplicationContext context=new AnnotationConfigApplicationContext(configg.class);
//        Cart x =  context.getBean(Cart.class);
//        x.getCart();
        Payment x1 = context.getBean(Payment.class);
        x1.getPayment();
        Cart c = context.getBean(Cart.class);
        c.getCart();
        Account a = context.getBean(Account.class);
        a.getAccount();

    }
}