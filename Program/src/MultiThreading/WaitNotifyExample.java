package MultiThreading;

class SharedData{
    private boolean dataReady = false;

    synchronized void produce(){
        System.out.println("Procedure: Preparing Data...");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){}

        if(dataReady){
            System.out.println("Producer: data ready, notifying... and assing as true");
            notify();
        }

            System.out.println("Producer: data ready, Notifying... and assing as false");
            notify();

    }

    synchronized void consume(){
        System.out.println("Consume: Waiting for the Data...");
        try{
            while(!dataReady){
                wait();
            }
        }
        catch (InterruptedException e){}

        System.out.println("Consumer: data received and consuming...");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedData sd = new SharedData();

        Thread thread1 = new Thread(()-> sd.consume() );

        Thread thread2 = new Thread(()-> sd.produce());

        thread1.start();
        thread2.start();
    }

}
