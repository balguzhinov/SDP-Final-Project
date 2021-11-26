package strategy;

import absFactory.BreakfastUnit;
import absFactory.ChefUnitFactory;
import absFactory.LunchUnit;
import adapter.Cash;
import adapter.QR;
import adapter.QRAdapter;

import java.util.Scanner;

public class Pay implements CustomerBehavior{

    Scanner scanner = new Scanner(System.in);
    Order order = new Order();

    @Override
    public void action(ChefUnitFactory chef) {

        System.out.println("Choose a payment method");
        System.out.println("Press 1---Cash\n"+
                    "Press 2---QR");
        int n = scanner.nextInt();
            switch (n) {
                case 1:
                    Cash cash = new Cash();
                    cash.pay();
                    break;
                case 2:
                    QR qr = new QR();
                    QRAdapter qrAdapter = new QRAdapter(qr);
                    qrAdapter.pay();
                    break;
            }



    }

}
