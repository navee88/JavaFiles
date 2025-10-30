package Coltio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Lop3 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Apple", "Bannana", "Graphes", "Pineapple"));

        ListIterator<String> it = lst.listIterator();

        while(it.hasNext()){

            String fruits = it.next();

            if(fruits == "Apple"){
                it.set("Ooty Apple");
            }

            if(fruits == "Graphes"){
                it.add("Mango");
            }

            if(fruits == "Pineapple"){
                it.remove();
            }
        }

        System.out.println(lst);
    }
}
