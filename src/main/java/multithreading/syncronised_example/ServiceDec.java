package multithreading.syncronised_example;

public class ServiceDec implements Runnable {
    private SynchronisedService synchronisedService;

    public ServiceDec(SynchronisedService synchronisedService) {
        this.synchronisedService = synchronisedService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
                synchronisedService.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
