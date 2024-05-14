package Learn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int r = sol.longestConsecutive(arr);
        System.out.println(r);
    }
}

