package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MapReduce {
    public static void main(String[] args) {
        int reduce = IntStream.rangeClosed(1, 5).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        List<String> list = Arrays.asList("abcd","abc","abcdef","ric","ab");
        String s = list.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println(s);

        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        int sum = list1.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        double asDouble = list1.stream().mapToDouble(i -> i).average().getAsDouble();
        System.out.println(asDouble);

    }
}
