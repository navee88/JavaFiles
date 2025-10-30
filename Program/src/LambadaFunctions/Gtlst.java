package LambadaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Gtlst {
    public static void main(String[] args) {
//        List<String> lst = new ArrayList<>(Arrays.asList("Apple","Pineapple","Apple IN", "Dummy Apple", "Apple Ios 26","Apple"));
//        List<String> result= lst.stream()
//                             .filter((words)-> words.startsWith("A"))
//                              .map((word)-> word.toUpperCase())
//                              .sorted()
//                                .distinct()
//                              .collect(Collectors.toList());
//        System.out.println(result);
        List<String> lst = new ArrayList<>(Arrays.asList("hello", "world"));
        List<String[]> result = lst.stream().map((word)->word.split("")).collect(Collectors.toList());
        for(String[] arr: result){
            System.out.println(Arrays.toString(arr));
        }

        List<String> flmp = result.stream().flatMap((words) -> Arrays.stream(words)).collect(Collectors.toList());
        for(String as : flmp){
            System.out.print(as);
        }

    }
}
