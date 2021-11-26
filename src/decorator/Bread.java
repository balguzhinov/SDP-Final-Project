package decorator;

public class Bread implements Dish {
    @Override
    public String getDescription() {
        return "Bread ";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}
