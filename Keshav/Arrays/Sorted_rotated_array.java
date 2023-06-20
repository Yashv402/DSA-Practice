class Solution {
    public boolean check(int[] nums) {
        int n=0;
        int a=nums.length;
        for (int i=0;i<a-1;i++){
          if (nums[i]>nums[i+1]){
            n++;
          }
        }
        if(nums[a-1]>nums[0]){
          n++;
        }
        if (n>1){ 
          return false;
        }
        return true; 
    }
}