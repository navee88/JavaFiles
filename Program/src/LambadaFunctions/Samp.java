package LambadaFunctions;

@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}


public class Samp {
    public static void main(String[] args) {
        Greeting greet  = (name) ->{
            System.out.println("Hello" + name);
        };
        greet.sayHello("Raju Bai");
    }
}
