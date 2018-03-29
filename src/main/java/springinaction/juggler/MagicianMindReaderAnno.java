package springinaction.juggler;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MagicianMindReaderAnno implements MindReader {

    @Pointcut("execution(* springinaction.juggler.Tinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Before("thinking(thoughts)")
    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts: " + thoughts);
    }

    @Override
    public String getThoughts() {
        return null;
    }
}
