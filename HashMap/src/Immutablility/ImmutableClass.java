package Immutablility;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private  final Map<String,String> map;

    public ImmutableClass(int id, String name, Map<String, String> map) {
        this.id = id;
        this.name = name;

        Map<String,String> temp = new HashMap<>();

        map.forEach((k,v)->temp.put(k,v));
        this.map=temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMap() {
        Map<String,String> temp = new HashMap<>();
       this.map.forEach((k,v)->temp.put(k,v));
        return temp;
    }
}
