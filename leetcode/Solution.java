package leetcode;

import java.util.*;

/**
 * Created by vn0dht3 on 1/16/17.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        //Arrays.sort(nums);
        int result[]=new int[2];

        Map<Integer,Integer> map= new HashMap<>(); // value,index
        int index=0;
        for(int i: nums){
            int check=(target-i);
            if(map.containsKey(check)){
                result[0]=index;
                int value=map.get(check);
                result[1]=value;
                break;
            }else{
                map.put(i,index);
            }
            index++;
        }

        return result;
    }
}