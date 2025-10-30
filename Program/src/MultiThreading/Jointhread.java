package MultiThreading;

public class Jointhread {
    public static void main(String[] args) throws InterruptedException {
        Runnable rb1 = ()->{
            System.out.println("Joining Thread 1");
        };

        Runnable rb2 = ()->{
            System.out.println("Joining Thread 2");
        };

        Runnable rb3 = ()->{
            System.out.println("Joining Thread 3");
        };

        Thread th1 = new Thread(rb1);
        Thread th2 = new Thread(rb2);
        Thread th3 = new Thread(rb3);

        th1.start();
        th1.join(200, 10000);

        th2.start();
        th2.join(4000);

        th3.start();
    }
}
