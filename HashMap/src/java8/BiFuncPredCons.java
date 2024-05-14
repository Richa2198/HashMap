package java8;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFuncPredCons {
    public static void main(String[] args) {
        //Bifunction example
        /*Example 1*/
        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction = (l1,l2)-> Stream.of(l1,l2).
                flatMap(List::stream).distinct().collect(Collectors.toList());

        List<Integer> l1 = Arrays.asList(1,4,8,0,12);
        List<Integer> l2 = Arrays.asList(8,24,4,2,6,7);
        List<Integer> apply = biFunction.apply(l1, l2);
        System.out.println(apply);
        /*Exmaple 2*/
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Richa",5000);
        map.put("Neeraj",4000);
        map.put("Advika",3000);
        map.replaceAll((k,v)->v+1000);
        System.out.println(map);

        //BiConsumer Example
        BiConsumer<String,Integer> biConsumer=(t1,t2)->System.out.println("Key: "+t1+" Value: "+t2);
        biConsumer.accept("Gogo",123);
        map.forEach(biConsumer);

        //BiPredicate Example
        BiPredicate<String,String> biPredicate = (s1,s2)->s1==(s2);
        System.out.println(biPredicate.test("aba","aba"));

        //sort map
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
