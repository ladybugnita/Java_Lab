package Lab4;

public class CounterSync extends Thread{
    Counter counter;

    public CounterSync(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();  // Incrementing count 1000 times
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterSync t1 = new CounterSync(counter);
        CounterSync t2 = new CounterSync(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Counter Value: " + counter.getCount());
    }

}
 
