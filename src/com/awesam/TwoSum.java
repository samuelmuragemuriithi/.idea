package com.awesam;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> HM=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement =  target-nums[i];
            if(HM.containsKey(complement))
                return new int []{HM.get(complement),i};
            HM.put(nums[i],i);
        }
        throw new IllegalArgumentException("No match");
    }
   static int []twoSum2(int[]arr,int target){
        HashMap<Integer,Integer> hashMap= new HashMap<>();
       for (int i = 0; i <arr.length ; i++) {
           int complement = target-arr[i];
           if (hashMap.containsKey(complement))return new int[]{hashMap.get(complement),i};
           else hashMap.put(arr[i],i);
       }
       throw new IllegalArgumentException("No such element");
   }
    public static void main(String[] args) {
        TwoSum ts= new TwoSum();
        int[] nums={2,7,11,15};
         int target=9;
        System.out.println(Arrays.toString(ts.twoSum(nums,target)) );

        System.out.println(Arrays.toString(twoSum2(nums,target)));

    }
}

