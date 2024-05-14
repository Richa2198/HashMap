package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsSuppPredExample {
    public static void main(String[] args) {
        //Consumer Example:
        Consumer<Integer> consumer = t->{
            if(t%2==0)
                System.out.println(t+" is even");
            else
                System.out.println(t+" is odd");
        };
        consumer.accept(10);
        List<Integer> l = Arrays.asList(3,5,9,10,15);
        l.forEach(t->{
            if(t%2==0)
                System.out.println(t+" is even in list");
            else
                System.out.println(t+" is odd in list");
        });

        //Supplier Example:d
        Supplier<Integer> supplier = ()->0;
        //System.out.println(supplier.get());;
        //List<Integer> list = Arrays.asList(3,5,9,10,15);
       // System.out.println(list.stream().findAny().orElseGet(supplier));
        List<Integer> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->0));

        //Predicate Example
        Predicate<Integer> predicate= (t)->t%2==0;
        System.out.println(predicate.test(10));
        List<Integer> list1 = Arrays.asList(3,5,9,10,15);
        List<Integer> collect = list1.stream().filter(t -> t % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
