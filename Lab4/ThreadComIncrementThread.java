package Lab4;

public class ThreadComIncrementThread extends Thread{
    ThreadComSharedData data;

    public ThreadComIncrementThread(ThreadComSharedData data) {
        this.data = data;
    }

    public void run() {
        try {
            Thread.sleep(1000);  // Simulate some delay
            data.increment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
