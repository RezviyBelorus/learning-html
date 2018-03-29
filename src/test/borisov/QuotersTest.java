package borisov;

import com.sun.javafx.binding.SelectBinding;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:borisov.xml")
public class QuotersTest {
    @Test
    public void sayQuote() {
        boolean result = true;
        Assert.assertTrue(result);
    }
}

