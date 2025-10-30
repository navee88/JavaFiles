package OOPS;

class Parents{
    void display(){
        System.out.println("Hi Hello");
    }
}

class Child extends Parents{
    @Override
    void display(){
        super.display();
        System.out.println("Hi World");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
