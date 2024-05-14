package Coding;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeated {
    public static void main(String[] args) {
        String[] arr = {"richa","gogo","gogo","hnhn"};
        if(arr.length<1){
            System.out.println("");
        }
        else {
            String s1 = Arrays.stream(arr).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey).get();
            System.out.println(s1);
        }
    }
}
