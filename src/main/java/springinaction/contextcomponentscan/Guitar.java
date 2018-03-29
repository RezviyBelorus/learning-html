package springinaction.contextcomponentscan;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{
    public Guitar() {
    }

    public void play() {
        System.out.println("Strum strum strum");
    }
}
