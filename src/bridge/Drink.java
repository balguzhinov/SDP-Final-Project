package bridge;

public abstract class Drink {
    protected DrinkAPI drinkAPI;

    public Drink(DrinkAPI drinkAPI) {
        this.drinkAPI = drinkAPI;
    }

    public abstract String desc();
    public abstract double cost();
}
