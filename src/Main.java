import absFactory.*;
import observer.Reception;
import observer.Subscriber;
import strategy.Pay;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = name();
        Subscriber s = new Subscriber(name);
        Customer customer = new Customer();    // default action is order
        Reception reception = new Reception();

        reception.addSubscriber(s);

        customer.display(name);         //strategy
        customer.executeAction();       //Order

        customer.setMovement(new Pay());
        customer.executeAction();       //Pay

        reception.notifySubscriber();
        reception.removeSubscriber(s);

    }


    private static String name() {
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        return name;
    }



}
