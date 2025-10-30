package OOPS;

class Sty{
    //Non
    void display(){
        System.out.println("Hello World");
    }

    static void dis(){
        System.out.println("Hello");
    }
}

public class Staticpro {
    public static void main(String[] args) {
        Sty st = new Sty();
        st.display();
        Sty.dis();
    }
}
