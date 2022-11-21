import java.util.Observable;
import java.util.ArrayList;
import java.util.List;

public class Timer extends Observable {
    List<Toto> myObservers = new ArrayList<Toto>();
    private int n = 0;

    public Timer() {

    }

    public void setX(int x) {
        n = x;
        // setChanged();
        // notifyObservers();
        notifier();

    }

    public void notifier() {
        for (Toto to : myObservers) {
            to.update(this, to);
        }
    }

    public int getX() {
        return n;
    }

    public void addObserver(Toto to) {
        myObservers.add(to);
    }

    public void deleteObserver(Toto to) {
        myObservers.remove(to);
    }
}
