package observer;

public class Subscriber implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String name) {
        setName(name);
        System.out.println("Hey, " + name +" your Order is done, AS BOLSYN !");
    }

}
