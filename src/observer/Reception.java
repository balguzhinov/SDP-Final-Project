package observer;

import java.util.ArrayList;
import java.util.List;

public class Reception implements Observable{
    List<Subscriber> clients = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber client) {
        clients.add(client);
    }

    @Override
    public void removeSubscriber(Subscriber client) {
        clients.remove(client);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber x: clients){
            x.update(x.getName());
        }
    }

}
