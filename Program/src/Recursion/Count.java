package Recursion;

public class Count {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n){
        if(n > 0){
            System.out.println(n);
            countdown(n-1);
        }
    }
}
