import strategy.CustomerBehavior;
import strategy.Order;
import strategy.People;

public class Customer extends People {

    public Customer() {
        super(new Order());
    }

    @Override
    public void display(String name) {
        System.out.println("Hello "+name+":)");
    }
}
