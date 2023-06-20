package com.newDSA;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count_max=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                if(count_max<count){
                    count_max=count;
                }
                count=0;
            }
        }
        if(count>count_max){
            return count;
        }
        else{
            return count_max;
        }
    }
}
