package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Richa", 1);
        map.put("Neeraj", null);
        map.put(null, 3);
        map.put(null, 5);
        map.put("Saurabh", 4);

        map.forEach((k,v)->{
            if(k.length()>2)
                System.out.println("Value: "+v);
        }

        );
//
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//        }

       map.forEach((k,v)-> System.out.println("Key: "+k+" Value: "+v));
//
//        List<String> list = Arrays.asList("abc", "java", "python");
//        Stream<String> stream = Stream.of("abc", "java", "python");
//        Consumer<String> consumer = (String s)->{
//            StringBuilder sb = new StringBuilder();
//            for(char c : s.toCharArray()){
//                String hex = Integer.toHexString(c);
//                sb.append(hex);
//            }
//           System.out.println(sb);
//        };
//        list.forEach(consumer);
//        stream.forEach(consumer);

        List<List<String>> list = Arrays.asList(Arrays.asList("Richa","Mahobia"),Arrays.asList("abc","def"));
        List<String> list1 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(list1);

        String str = "Gogo";
        str =str.toLowerCase();
        Map<String,Long> map1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(map1);
        Map<String, Long> longMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

    }
}
