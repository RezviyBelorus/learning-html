package borisov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Quoters {
    @Autowired
    List<Quoter> qouters;

    @PostConstruct
    void init() {
        qouters.forEach(quoter -> quoter.sayQuote());
    }
}
