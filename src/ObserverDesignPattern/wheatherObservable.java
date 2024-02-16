package ObserverDesignPattern;

public interface wheatherObservable {

    void add(wheatherObserver wheatherObserver);
    void remove(wheatherObserver wheatherObserver);
    void notify1();
    void setData();
    void getData();

}
