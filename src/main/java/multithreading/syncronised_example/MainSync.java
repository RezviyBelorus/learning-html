package multithreading.syncronised_example;

public class MainSync {
    public static void main(String[] args) throws InterruptedException {
        SynchronisedService synchronisedThread = new SynchronisedService();
        Thread thread1 = new Thread(new ServiceInc(synchronisedThread));
        Thread thread2 = new Thread(new ServiceDec(synchronisedThread));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synchronisedThread.displayCounter());


    }
}
