package MethodReference;

@FunctionalInterface
interface A{
    public String display();
}

class AB{
    static String display1(){
        System.out.println("Hello world");
        return "df";
    }
}

public class MR {
    public static void main(String[] args) {
        A r = AB::display1;
        r.display();
    }
}
