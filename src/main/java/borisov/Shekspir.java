package borisov;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Shekspir implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Be or not to be");
    }
}
