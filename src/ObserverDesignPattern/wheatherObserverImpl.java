package ObserverDesignPattern;

public class wheatherObserverImpl implements wheatherObserver{
    wheatherObservable wheatherObservable;
    String name = "";
    public wheatherObserverImpl(wheatherObservable wheatherObservable) {
        this.wheatherObservable = wheatherObservable;
    }

    @Override
    public void update() {
        System.out.println(wheatherObservable);
        wheatherObservable.notify1();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
