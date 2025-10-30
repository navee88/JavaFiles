package Coltio;

import OOPS.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArrays {
    public static void ormain(String[] args) {
        int[] arr = {40,10,50,20,30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 50);
        System.out.println(index);

        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println("Copied of Arrays: " + Arrays.toString(copy));

        int[] range = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copy of Range (1 to 3): " + Arrays.toString(range));

        System.out.println("Arrays equal " + Arrays.equals(arr, copy));

        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 99);
        System.out.println("Filled Array: " + Arrays.toString(fillArr));


        // Modifed List
        List<Integer> lst1 = Arrays.asList(1,2,3,4);
        lst1.add(45);
        lst1.add(50);
        System.out.println(lst1);

        // Read Only List
        List<Integer> lst2 = List.of(1,2,3,4,5);
        lst2.add(30);
        lst2.add(34);
        System.out.println(lst2);
    }
}
