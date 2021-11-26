package absFactory;

import bridge.Drink;
import bridge.Water;
import bridge.WithSoda;
import bridge.WithoutSoda;
import decorator.*;

public class Lunch implements LunchUnit{
    Dish dish = new Fries(new Sauce(new Beef(new Bread())));
    Drink sodaWater = new Water(new WithSoda());
    double total = dish.getCost()+ sodaWater.cost();

    @Override
    public void cook() {
        System.out.println(dish.getDescription()+dish.getCost()+'\n'+
        sodaWater.desc()+" "+sodaWater.cost());

        System.out.println("Total price: "+ total + '\n');
    }

}
