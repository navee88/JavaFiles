package OOPS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queuejv {
    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
//        qu.add(10);
//        qu.add(20);
//        qu.add(40);
//        qu.add(3);
//        System.out.println(qu);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            qu.add(sc.nextInt());
        }

        System.out.println(qu);

    }
}
