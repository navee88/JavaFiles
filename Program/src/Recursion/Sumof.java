package Recursion;

public class Sumof {
    public static void main(String[] args) {
        System.out.println(sumofnum(5));
    }
    public static int sumofnum(int n){
        if(n>1){
            return (n + sumofnum(n-1));
        }
        return 1;
    }
}
