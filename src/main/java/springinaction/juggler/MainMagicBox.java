package springinaction.juggler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMagicBox {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer magician = (Performer) ctx.getBean("harry");
        magician.perform();

        InstrumentalistAbstract magician2 = (InstrumentalistAbstract) ctx.getBean("stevie");
        Instrument firstGuitar = magician2.getInstrument();
        System.out.println(firstGuitar);

        Instrument secondGuitar = magician2.getInstrument();
        System.out.println(secondGuitar);

        Instrument thirdGuitar = magician2.getInstrument();
        System.out.println(thirdGuitar);

        magician = (Performer) ctx.getBean("poeticDuke");
        magician.perform();
    }
}
