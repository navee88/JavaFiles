package MultiThreading;

import OOPS.In;

class Deadlock{
    synchronized void thread1(Deadlock other){
        System.out.println("Thread1 crruent name : " + Thread.currentThread().getName() + " in Thread.");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
        other.thread2(this);
    }

    synchronized void thread2(Deadlock other){
        System.out.println("Thread2 current name : " + Thread.currentThread().getName() + " in Thread.");
//        other.thread1(this);
    }
}

public class Deadlockeg {
    public static void main(String[] args)throws InterruptedException {
            Deadlock dl1 = new Deadlock();
            Deadlock dl2 = new Deadlock();

            Thread t1 = new Thread(()-> dl1.thread1(dl2), "Thread A");
            Thread t2 = new Thread(()-> dl2.thread2(dl1), "Thread B");

            t1.start();
//            t1.join();

            t2.start();
    }
}

//Time 0: Main Thread
//        |
//                |--- t1.start() → Thread A begins dl1.thread1(dl2)
//        |       Thread A acquires dl1 lock
//        |       Prints: "Thread1 current name: Thread A"
//        |
//Time 0-5s: Thread A sleeping (Thread.sleep(5000))
//        |       Holds dl1 lock (sleep does NOT release it)
//        |
//Time 5s: Thread A wakes up
//        |       Calls dl2.thread2(this) → acquires dl2 lock
//        |       Prints: "Thread2 current name: Thread A"
//        |       Calls dl1.thread1(this) recursively → reentrant lock, Thread A continues
//        |       (all recursive calls are still Thread A)
//        |
//Time X: Thread A finishes all recursive calls
//        |       Releases dl1 and dl2 locks
//        |
//Time X+: Main Thread unblocked from t1.join()
//        |--- t2.start() → Thread B begins dl2.thread2(dl1)
//Thread B acquires dl2 lock
//Prints: "Thread2 current name: Thread B"
//Calls dl1.thread1(this) → acquires dl1 lock
//Executes recursively as needed
