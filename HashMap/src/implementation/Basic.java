package implementation;

import java.util.HashMap;
import java.util.Map;

public class Basic implements CountCharacter{

    @Override
    public int giveCharacter(String str,String key) {
        HashMap<Character,Integer> record = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == key.charAt(0)) {
                if (!record.isEmpty() && record.containsKey(str.charAt(i))) {
                    record.put(str.charAt(i), record.get(str.charAt(i)) + 1);
                } else
                    record.put(str.charAt(i), 1);
            }
        }
        return record.get(key.charAt(0));
    }
}
