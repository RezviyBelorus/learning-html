package springinaction.juggler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;

@Configurable("pianist")
public class Instrumentalist implements Performer {
    private Instrument instrument;
    private String song;
    private int age;
    @Value("sex")
    private String sex;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.println(sex);
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
