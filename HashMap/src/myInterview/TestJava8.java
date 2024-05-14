package myInterview;

import java.util.*;
import java.util.stream.Collectors;

/*
   occurence of each character
 * duplicate element
 * first non repeat element
 * second highest number from array
 * longest string
 * all elements starts with 1 in array of integers
 second highest element from array
 * 1-2-3-4
 * print 2 to 9 out of 1 10 series
 * sort a list

 sort map by value
 * */
public class TestJava8 {
    public static void main(String[] args) {
        String string = "i love my life";
        int[] arr = {5,9,11,12,2,8,21,1};
        String str = string.replaceAll("\s+","");
        Map<String, Long> longMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Occurence of each character: "+longMap);
        System.out.print("Duplicate Elements: ");
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(i->System.out.print(i+" "));
        System.out.println("\n");
        String s1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
        System.out.println("First non repeat element: "+s1);

        String s = Arrays.stream(string.split(" ")).reduce((st1, st2) -> st1.length() > st2.length() ? st1 : st2).get();
        System.out.println("Longest string: "+s);
        List<String> stringList = Arrays.stream(arr).boxed().map(i -> i + "").filter(j -> j.startsWith("1")).collect(Collectors.toList());
        System.out.println("All elements starts with 1: "+stringList);

        int integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second highest number: "+integer);

        String [] array = {"1","2","3","4"};
        //1-2-3-4
        String stt = String.join("-",array);
        System.out.println(stt);

        List<Integer> list = Arrays.asList(10,4,2,3,5,6,7,1,8,9);
        List<Integer> limit = list.stream().skip(1).limit(8).collect(Collectors.toList());
        System.out.println(limit);
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        //sort map of employees present in key
        HashMap<Employee,Integer> hm = new HashMap<>();
        hm.put(new Employee(2,"Pragya",24,"Female","Product Development",2010,60000.5),1);
        hm.put(new Employee(1,"Richa",25,"Female","IT",2022,80000.0),2);
        hm.put(new Employee(4,"Neeraj",20,"Male","Sales and marketing",2023,12300.0),3);

        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);

        //sort list of employee by normal way and by stream api
        AddingEmployee a = new AddingEmployee();
        List<Employee> empList = a.adding();
        Collections.sort(empList, Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println("sorted year of joining list: "+empList);
        empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"neeraj");
        map.put(3,"advika");
        map.put(5,"rich");
        map.put(4,"min");
        map.put(2,"kritika");


       HashMap<Integer, String> collecting = map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
      System.out.println(collecting);

      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

      //supplier example
        List<String> l = Arrays.asList();
        System.out.println(l.stream().findAny().orElseGet(()->"rich"));





    }
}
