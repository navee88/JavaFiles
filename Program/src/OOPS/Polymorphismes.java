package OOPS;

class Add{

    void addtion(int a, int b){
        System.out.println(a+b);
    }

    void addtion(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void addtion(int a, double b, int c){
        System.out.println(a+b+c);
    }

}


public class Polymorphismes {
    public static void main(String[] args) {
        Add ad = new Add();
        ad.addtion(10,20);
        ad.addtion(10,20,30);
        ad.addtion(10,40.5,30);
    }
}
