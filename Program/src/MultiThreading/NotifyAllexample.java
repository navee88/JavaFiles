package MultiThreading;

class Sharedqueue{
    private int data = 0;
    private boolean available = false;

    public synchronized void produce(int value){
        while(available){
            try {
                wait();
            }
            catch (InterruptedException e) {};
        }

        data = value;
        available = true;
        System.out.println("Produce: " + value);

        notifyAll();
    }

    public synchronized void consume(){
        while (!available) {
            try {
                wait();
            }
            catch (InterruptedException e) {};
        }
        System.out.println(Thread.currentThread().getName() + " consumed: " + data);
        available = false;

        notifyAll();
    }
}


public class NotifyAllexample {
    public static void main(String[] args) throws InterruptedException {
        Sharedqueue sq = new Sharedqueue();

        Thread producer = new Thread(()->{
            for (int i = 0; i <= 5; i++) {
                sq.produce(i);
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){};
            }
        }, "Producer");

        Thread consumer1 = new Thread(() -> {
            for (int i = 1; i <= 2; i++) sq.consume();
        }, "Consumer-1");

        Thread consumer2 = new Thread(() -> {
            for (int i = 2; i <= 5; i++) sq.consume();
        }, "Consumer-2");

        producer.start();
        consumer1.start();
        consumer1.join();
        consumer2.start();
    }
}
