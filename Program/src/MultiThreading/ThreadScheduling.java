package MultiThreading;

public class ThreadScheduling {
    public static void main(String[] args) throws InterruptedException{
        Runnable rb = ()->{
            for(int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName()+ " is running with the priority of " + Thread.currentThread().getPriority());

               try{
                   Thread.sleep(2000);
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }

            }
            System.out.println(Thread.currentThread().getName() + " finished execution");
        };
        Thread thread1 = new Thread(rb);
        Thread thread2 = new Thread(rb);
        Thread thread3 = new Thread(rb);

        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread1.join();

        thread2.start();
//        thread2.join();

        thread3.start();

    }
}
