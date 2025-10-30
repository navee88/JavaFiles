package MultiThreading;

public class IntterputedExceptionjs {
    public static void main(String[] args) {
        Runnable rb1 = () -> {
            try {
                System.out.println("Thread-1 going to sleep for 2 minutes...");
                Thread.sleep(20000);
                System.out.println("Thread-1 woke up normally.");
            } catch (InterruptedException e) {
                System.out.println("The Thread 1 was interrupted during the sleep");
            }
        };

        Thread thread1 = new Thread(rb1);

        Runnable rb2 = () -> {
            System.out.println("Thread-2 will interrupt Thread-1 after 2 seconds...");
            try {
                Thread.sleep(2000); // give Thread-1 time to start sleeping
            } catch (InterruptedException e) {
            }
            thread1.interrupt();
            System.out.println("Thread-2 sent interrupt signal to Thread-1");
        };


        Thread thread2 = new Thread(rb2);

        thread1.start();
        thread2.start();

    }
}
