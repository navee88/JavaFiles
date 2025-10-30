package OOPS;

class Down {
    void display() {
        System.out.println("Hi");
    }
}

class Chen2 extends Down {
    void display2() {
        System.out.println("Hello");
    }
}

public class Cst {
    public static void main(String[] args) {
        Down sf = new Chen2();
        ((Chen2) sf).display2();
    }
}
