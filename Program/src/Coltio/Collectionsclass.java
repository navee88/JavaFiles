package Coltio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectionsclass {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(Arrays.asList(10,50,20,40,30));

        System.out.println("Original List : " + lst);

        Collections.sort(lst);
        System.out.println("Sort List : "+ lst);

        Collections.reverse(lst);
        System.out.println("Reverse List : " + lst);

        Collections.shuffle(lst);
        System.out.println("Shuffle List : " + lst);

        System.out.println("Min List : " + Collections.min(lst));
        System.out.println("Max List : " + Collections.max(lst));

        lst.add(20);
        System.out.println("Frequency of 20 : " + Collections.frequency(lst,20));

        Collections.swap(lst,1,2);
        System.out.println("Swapping List : " + lst);

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Collections.fill(fruits, "Mango");
        System.out.println("After Fill: " + fruits);

        List<Integer> src = Arrays.asList(1, 2, 3, 4);
        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        Collections.copy(dest, src);
        System.out.println("After Copy (dest): " + dest);

        Collections.sort(lst);
        int search = Collections.binarySearch(lst, 30);
        System.out.println("Sarch list : "+search);

        List<Integer> synclist = Collections.synchronizedList(lst);
        System.out.println(synclist);
    }
}
