package springinaction.testInterface;

public class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("Rabbit easting");
    }

    public void walk(){
        System.out.println("Rabbit walking");
    }
}
