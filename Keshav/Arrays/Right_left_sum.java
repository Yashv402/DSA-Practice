class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int right=0;
        int left=0;
        int diff;
        for(int i=0;i<n;i++){
            right+=nums[i];
        }
        for(int i=0;i<n;i++){
            right-=nums[i];
            diff=Math.abs(right-left);
            left+=nums[i];
            nums[i]=diff;
        }
    return nums;
    }
}