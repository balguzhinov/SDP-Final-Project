package bridge;

public class WithoutSoda implements DrinkAPI{
    @Override
    public String desc() {
        return "without soda";
    }

    @Override
    public double cost() {
        return 0.00;
    }
}
