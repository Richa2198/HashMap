package Demo;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Demo {
    /*
0
101
21012
3210123
432101234
54321012345
*/
    public static void main(String[] args) {
         String s = "applepenapple";
         List<String> wordDict = Arrays.asList("apple","pen","apple");

         StringBuilder sb = new StringBuilder(s);
        final boolean[] temp = {true};
       wordDict.stream().forEach(i-> {
           if (sb.indexOf(i) > -1) {
               sb.replace(sb.indexOf(i),i.length(),"");
           }
           else{
               temp[0] =false;
           }
       });

        System.out.println(temp[0]);


                //filter(str -> sb.indexOf(str) > -1).map(str -> sb.replace(sb.indexOf(str), sb.lastIndexOf(str), ""));

    }
    }


