package multithreading.syncronised_example;

public class SynchronisedService {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public synchronized void decrement() {
        counter--;
    }

    public synchronized int displayCounter() {
        return counter;
    }
}
