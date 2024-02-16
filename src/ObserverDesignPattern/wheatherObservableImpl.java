package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class wheatherObservableImpl implements wheatherObservable{

    List<wheatherObserver> list = new ArrayList<>();
    @Override
    public void add(wheatherObserver wheatherObserver) {
        list.add(wheatherObserver);

    }

    @Override
    public void remove(wheatherObserver wheatherObserver) {
        list.remove(wheatherObserver);

    }

    @Override
    public void notify1() {
        for (wheatherObserver wheatherObserver : list) {
            wheatherObserver.update();
        }
        System.out.println("Shivam");

    }

    @Override
    public void setData() {

    }

    @Override
    public void getData() {

    }
}
