package Learn;

import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len =1;
        int start=0;
        int end=0;
        map.put(nums[0],1);
        int key =0;
        int flag=0;
        for(int i=1;i<nums.length;i++) {
            key = nums[i];
            if (map.containsKey(nums[i] + 1) && map.containsKey(nums[i] - 1)) {
                flag = 1;
                if (key + 1 == start) {
                    start = (key - 1) - (map.get(key - 1) - 1);
                }
                if(key-1 == end){
                    end = key + 1 + (map.get(key + 1) - 1);
                }
            } else if (map.containsKey(nums[i] + 1)) {
                flag = 1;
                if (len == 1)
                    start = key;
                end = key + 1 + (map.get(key + 1) - 1);
            } else if (map.containsKey(nums[i] - 1)) {
                flag = 1;
                if (len == 1)
                    start = nums[i] - 1;
                else if (len < (nums[i] - (nums[i] - 1)) + 1)
                    end = nums[i];
                else if (len == (nums[i] - (nums[i] - 1)) + 1) {
                    map.put(key - 1, len);
                } else {
                    map.put(key - 1, (nums[i] - (nums[i] - 1)) + 1);
                }
            }
            if (flag == 1) {
                if (len < (end - start) + 1) {
                    len = (end - start) + 1;
                }
                map.put(key, len);
                flag = 0;
                map.put(start, len);
                map.put(end, len);
            }

            else
                map.put(key,1);
        }
        return len;
    }
}