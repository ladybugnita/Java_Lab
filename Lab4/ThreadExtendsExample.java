package Lab4;

public class ThreadExtendsExample extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExtendsExample t1 = new ThreadExtendsExample();
        ThreadExtendsExample t2 = new ThreadExtendsExample();
        t2.setPriority(10);
        t1.start();  // Starting the first thread
        t2.start();  // Starting the second thread
    }
}