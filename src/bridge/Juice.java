package bridge;

public class Juice extends Drink{
    public Juice(DrinkAPI drinkAPI) {
        super(drinkAPI);
    }

    @Override
    public String desc() {
        return "Juice "+ drinkAPI.desc();
    }

    @Override
    public double cost() {
        return 2.00+ drinkAPI.cost();
    }

}
