package Immutablility;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","first");
        map.put("2","second");
        ImmutableClass i = new ImmutableClass(101,"Richa",map);

        System.out.println("before changes");
        System.out.println(i.hashCode());
        System.out.println(i.getId());
        System.out.println(i.getName());
        System.out.println(i.getMap());

        System.out.println("After chsnges");

       map.put("3","third");
        System.out.println(i.getMap());
        i.getMap().put("4","fourth");
        System.out.println(i.getMap());
        System.out.println(i.hashCode());

    }
}
