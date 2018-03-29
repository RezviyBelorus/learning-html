package springkiller.beanPostProcessorAnnotation;

import org.springframework.context.annotation.Scope;

public class T1000 extends TerminatorQuoter{
    @Override
    public void sayQuote() {
        System.out.println("Я жидкий");
    }
}
