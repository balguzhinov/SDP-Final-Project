package absFactory;

import bridge.*;
import decorator.*;

public class Breakfast implements BreakfastUnit{
    Dish dish = new Sauce(new Bread());
    Drink juice = new Juice(new WithoutSoda());
    double total = dish.getCost()+ juice.cost();

    @Override
    public void prepare() {
        System.out.println(dish.getDescription()+dish.getCost()+'\n'+
                juice.desc()+" "+juice.cost());

        System.out.println("Total price: "+ total+ '\n');
    }
}
