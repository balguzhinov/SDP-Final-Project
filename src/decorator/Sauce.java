package decorator;

public class Sauce extends toppingDecorator{
    public Sauce(Dish newDish) {
        super(newDish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sauce ";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
