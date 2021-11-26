package strategy;

import absFactory.ChefUnitFactory;
import absFactory.FastFoodFactory;

public abstract class People {

    private CustomerBehavior movement;
    private ChefUnitFactory chef = new FastFoodFactory();

    public People(CustomerBehavior movement) {
        this.movement = movement;
    }

    public void setMovement(CustomerBehavior m) {
        this.movement = m;
    }

    public void executeAction() {
        movement.action(chef);
    }

    public abstract void display(String name);
}
