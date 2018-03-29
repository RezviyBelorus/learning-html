package borisov.springdata;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration("classpath:borisov.xml")
@Transactional
public class SpringDataTest {
    @Autowired
    private SpeakerRepository speakerRepository;

    @Test
    public void testSpeaker() {
        Iterable<Speaker> all = speakerRepository.findAll();

    }
}
