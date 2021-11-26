package bridge;

public class Water extends Drink{
    public Water(DrinkAPI drinkAPI) {
        super(drinkAPI);
    }

    @Override
    public String desc() {
        return "Water "+drinkAPI.desc();
    }

    @Override
    public double cost() {
        return 1.00+drinkAPI.cost();
    }


}
