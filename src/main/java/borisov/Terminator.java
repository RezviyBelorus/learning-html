package borisov;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Terminator implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I'll be back");
    }
}
