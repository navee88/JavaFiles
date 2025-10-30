package Coltio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Lop2 {
    public static void main(String[] args) {
        List<String> lst2 = new ArrayList<>(Arrays.asList("Apple","Orange","Graphes","Pineapple"));

        ListIterator<String> it = lst2.listIterator(lst2.size());

        while(it.hasPrevious()){
            System.out.println(it.previous());
//            System.out.println("------------------------------");
            System.out.println(it.previousIndex());
        }


    }
}
