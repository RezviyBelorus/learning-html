package springinaction.juggler;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ContestantIntroducer {
    @DeclareParents(value = "springinaction.juggler.Performer+",
            defaultImpl= DancerContestant.class)
    public static Contestant contestants;
}

