package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 20, 15));
        numbers.sort((a,b)-> b-a);
        System.out.println(numbers);

        List<String> lst = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));

        List<String> sublst = fruits.subList(1,3);
        System.out.println(sublst);

        sublst.set(1,"Guva");
        System.out.println(sublst);

        System.out.println(fruits);



    }
}
