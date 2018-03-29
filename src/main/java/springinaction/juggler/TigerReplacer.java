package springinaction.juggler;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer{

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
