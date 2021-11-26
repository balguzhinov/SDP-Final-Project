package absFactory;

import decorator.Beef;
import decorator.Bread;
import decorator.Fries;
import decorator.Sauce;

public class FastFoodFactory implements ChefUnitFactory{
    @Override
    public BreakfastUnit createBreakfastUnit() {
        return new Breakfast();
    }

    @Override
    public LunchUnit createLunchUnit() {
        return new Lunch();
    }
}
