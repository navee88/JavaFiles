package Concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            if(i%2==0){
                System.out.println("Tasks A is Running...");
            }
            else{
                System.out.println("Tasks B is Running...");
            }
        }
    }
}
