package Lab4;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value: " + i);
        }
    }

    public static void main(String[] args) {
        RunnableExample myRunnable = new RunnableExample();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t1.start();  // Start first thread
        t2.start();  // Start second thread
    }
}
