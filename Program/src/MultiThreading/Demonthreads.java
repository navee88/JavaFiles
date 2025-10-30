package MultiThreading;

public class Demonthreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread is Demon or not");
        Runnable rd = () -> {
            if(!Thread.currentThread().isDaemon()){
                System.out.println(Thread.currentThread().getName() + " is not Demon " );
            }
            else{
                System.out.println(Thread.currentThread().getName() + " is Demon " );

            }
        };
        Thread t1 = new Thread(rd, "Thread A");
        Thread t2 = new Thread(rd, "Thread B");
        Thread t3 = new Thread(rd, "Thread C");

        t3.setDaemon(true);

        t1.start();
        t1.sleep(2000);
        t2.start();
        t2.sleep(2000);
        t3.start();
    }
}
