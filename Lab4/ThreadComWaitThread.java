package Lab4;

public class ThreadComWaitThread extends Thread{
    ThreadComSharedData data;

    public ThreadComWaitThread(ThreadComSharedData data) {
        this.data = data;
    }

    public void run() {
        try {
            data.waitForIncrement();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
