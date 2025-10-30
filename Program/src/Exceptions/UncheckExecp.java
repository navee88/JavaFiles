package Exceptions;

public class UncheckExecp {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String ab = null;
        try {
            int c = a / b;
            System.out.println(ab.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (NullPointerException e) {
            System.out.println("Null reference found");
        }

    }
}
