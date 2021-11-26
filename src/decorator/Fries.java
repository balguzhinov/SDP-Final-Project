package decorator;

import absFactory.LunchUnit;

public class Fries extends toppingDecorator {
    public Fries(Dish newDish) {
        super(newDish);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "fires ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

}
