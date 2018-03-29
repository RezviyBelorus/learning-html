package multithreading.syncronised_example;

public class ServiceInc implements Runnable {
    private SynchronisedService syncService;

    public ServiceInc(SynchronisedService syncService) {
        this.syncService = syncService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            syncService.increment();
        }
    }
}
