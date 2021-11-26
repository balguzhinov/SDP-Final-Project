package observer;

public interface Observable {
    void addSubscriber(Subscriber client);
    void removeSubscriber(Subscriber client);
    void notifySubscriber();
}
