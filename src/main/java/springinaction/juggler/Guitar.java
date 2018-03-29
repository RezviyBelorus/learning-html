package springinaction.juggler;

import java.util.concurrent.atomic.AtomicInteger;

public class Guitar implements Instrument{
    private static AtomicInteger count = new AtomicInteger(0);
    public Guitar() {
        count.incrementAndGet();
    }

    public void play() {
        System.out.println("Guitar Guitar Guitar");
    }

    @Override
    public String toString() {
        return "Guitar number: " + count.get();
    }
}
