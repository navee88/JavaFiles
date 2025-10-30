package OOPS;

class Parent{
    void sound(){
        System.out.println("Animal Make sound");
    }
}

class Dogchild extends Parent{
    void sound(){
        System.out.println("Dog Child");
    }
}

public class In {
    public static void main(String[] args) {
        Dogchild dg = new Dogchild();
        dg.sound();
    }
}
