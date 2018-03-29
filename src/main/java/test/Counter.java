package test;

public class Counter extends Thread {
    private int x = 0;


    public synchronized void inc() {
        x++;
    }

    public synchronized void dec() {
        x--;
    }

    public int getX() {
        synchronized (this) {

        }
        return x;
    }
}
