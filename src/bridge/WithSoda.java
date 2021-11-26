package bridge;

public class WithSoda implements DrinkAPI{

    @Override
    public String desc() {
        return "with soda ";
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
