package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*occurence of each character
* duplicate element
* first non repeat element
* second highest number from array
* longest string
* all elements starts with 1 in array of integers
* 1-2-3-4
* print 2 to 9 out of 1 10 series
* sort a list
* */
public class Questions {
    public static void main(String[] args) {
        String str = "i love my life";
        int[] arr = {5,9,11,12,2,8,21,1};
        //occurence of each character
        str = str.replaceAll("\s+","");
        Map<String, Long> longMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(longMap);

        //max occurence of string
        String[] string= {"geeks","geeks","gogo","richa","geeks","gogo"};
        String s2 = Arrays.stream(string).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();


        System.out.println(s2);


        //duplicate element
        List<String> entries = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(entries);

        String s = "ababbc";
        int k=2;

        long sum = Arrays.stream(s.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() >= k)
                .map(Map.Entry::getValue)
                .mapToLong(i -> i)
                .sum();
        System.out.println("longest k substring length: "+sum);

        //first non repeat element
        String s1 = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(s1);

        //second highest number from array
        int first = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(first);

        //longest string
        String[] stringarr = {"java","pyhton","c","microservices","spring"};
        String st = Arrays.stream(stringarr).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
        System.out.println(st);

        //all elements starts with 1 in array of integers
        List<String> stringList = Arrays.stream(arr).boxed().map(i -> i + "").filter(x -> x.startsWith("1")).collect(Collectors.toList());
        System.out.println(stringList);

        //join
        String [] array = {"1","2","3","4"};
        //1-2-3-4
        String stt = String.join("-",array);
        System.out.println(stt);

        //skip and limit example: print 2 to 9 out of 1 10 series
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> limit = list.stream().skip(1).limit(8).collect(Collectors.toList());
        System.out.println(limit);

        //sort a list

    }
}
