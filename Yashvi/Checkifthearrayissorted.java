package com.newDSA;

public class Checkifthearrayissorted {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean result = true;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                for(int j=i+1; j<n-1; j++){
                    if(nums[j]>nums[j+1]){
                        result= false;
                    }
                }
            }
        }
        return result;
    }
}
