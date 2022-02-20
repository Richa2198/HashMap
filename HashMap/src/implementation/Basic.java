package implementation;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    public void insert(){
        HashMap<Integer,String> hm = new HashMap<>();
        String str = "Richa";
        for(int i=0;i<5;i++){
            hm.put(i,Character.toString(str.charAt(i)));
        }
        for(Map.Entry<Integer,String> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args){
        Basic b = new Basic();
        b.insert();
    }
}
