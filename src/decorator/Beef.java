package decorator;

public class Beef extends toppingDecorator{
    public Beef(Dish newDish) {
        super(newDish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "beef ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
