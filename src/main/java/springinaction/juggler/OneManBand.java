package springinaction.juggler;

import java.util.*;

public class OneManBand implements Performer {
    private Map<String, String> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {

        instruments.forEach((k,v)-> System.out.println(k + ": " + v));
    }

    public void setInstruments(Map<String, String> instruments) {
        this.instruments = instruments;// Внедрение коллекции инструментов
    }
}
