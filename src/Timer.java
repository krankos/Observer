import java.util.Observable;

public class Timer extends Observable {
    private int n = 0;

    public Timer() {

    }

    public void setX(int x) {
        n = x;
        setChanged();
        notifyObservers();
    }

    public int getX() {
        return n;
    }
}
