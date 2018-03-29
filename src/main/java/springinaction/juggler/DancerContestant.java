package springinaction.juggler;

import org.springframework.stereotype.Component;

@Component
public class DancerContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("DancerContestant received award");
    }
}
