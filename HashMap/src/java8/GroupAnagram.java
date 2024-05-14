package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    //["eat","tea","tan","ate","nat","bat"]
    public static void main(String[] args){
        GroupAnagram ga = new GroupAnagram();
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> hm = new HashMap<>();
        List<String> list;
        List<List<String>> result = new ArrayList<>();
        for(String s : str){
            String st = ga.sort(s);
            if(hm.containsKey(st)){
                hm.get(st).add(s);
            }
            else {
                list = new ArrayList<>();
                list.add(s);
                hm.put(st, list);
            }
        }
        hm.values().forEach((v)-> result.add(v));
        System.out.println(result);
    }
    public String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
