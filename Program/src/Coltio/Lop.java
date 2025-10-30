package Coltio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lop {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Apple","Grapes","Orange","Avacoda"));

        for(String fruits: lst){
            System.out.println(fruits);
        }

        Iterator<String> it = lst.iterator();
        while(it.hasNext()){
            String guest = it.next();
            if(guest == "Apple"){
                it.remove();
            }
        }

        System.out.println(lst);
    }
}
