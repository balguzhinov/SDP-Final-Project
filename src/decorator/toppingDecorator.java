package decorator;

public abstract class toppingDecorator implements Dish{
    protected Dish tempDish;

    public toppingDecorator(Dish newDish) {
        this.tempDish = newDish;
    }

    public String getDescription() {
        return tempDish.getDescription();
    }

    public double getCost() {
        return tempDish.getCost();
    }
}
