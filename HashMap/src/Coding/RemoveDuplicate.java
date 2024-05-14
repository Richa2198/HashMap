package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,2,3,2,6};
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int[] array = set.stream().mapToInt(x->x).toArray();
        for(int i:array){
            System.out.println(i);
        }
    }
}
