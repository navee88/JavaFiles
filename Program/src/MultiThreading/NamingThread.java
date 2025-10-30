package MultiThreading;

class Chnagename extends Thread{

    Chnagename(String name){
        super(name);
        System.out.println("Thread name is changed: " + name);
    }

    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getName() + " " + "State : Running");

        for(int i=4; i>0;i--){
            System.out.println("Thread: " + Thread.currentThread().getName() + " " + "State : Running");
        }

        System.out.println("Thread: " + Thread.currentThread().getName() + " " + " State : Dead");
    }

    public void start () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}


class Namechange implements Runnable{

    private String threadname;

    Namechange(String name){
        threadname = name;
        System.out.println("Thread name is Changed : " + name);
    }

    public void run(){
        System.out.println("Current Thread Name : " + Thread.currentThread().getName() + " State : Start ");
        for(int i=4 ; i>0;i--){
            System.out.println("Thread " + Thread.currentThread().getName() + " State: Running");
        }
        System.out.println("Thread  " + Thread.currentThread().getName() + " State : Dead");
    }
}


public class NamingThread {
    public static void main(String[] args) {
        Chnagename thread1 = new Chnagename("Thread-1 Thread System");
        thread1.start();

        Namechange ncm = new Namechange("Thread-2 Runnable System");
        Thread t2 = new Thread(ncm,"Thread-2 Runnable System");

        t2.start();
    }
}
