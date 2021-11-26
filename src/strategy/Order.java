package strategy;

import absFactory.*;

import java.util.Scanner;

public class Order implements CustomerBehavior{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void action(ChefUnitFactory chef) {


        System.out.println("Order meal");




        System.out.println("Press 1---Breakfast"+'\n'+
                    "Press 2---Lunch");

        int n = scanner.nextInt();
            switch (n) {
                case 1:
                    BreakfastUnit breakfastUnit = chef.createBreakfastUnit();
                    breakfastUnit.prepare();
                    break;
                case 2:
                    LunchUnit lunchUnit = chef.createLunchUnit();
                    lunchUnit.cook();
                    break;
            }




    }

}
