package Recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
    }
    public static int sum(int start, int end){
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
