package Lab4;

public class ThreadComSharedData {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Incremented count: " + count);
        notify();  // Notify waiting threads
    }

    public synchronized void waitForIncrement() throws InterruptedException {
        while (count == 0) {
            wait();  // Wait until count is incremented
        }
        System.out.println("Waiting thread resuming after count: " + count);
    }
}