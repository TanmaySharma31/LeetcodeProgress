class Solution {
    public int maxScore(int[] nums, int k) {
        int lSum=0;
        int rSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            lSum+=nums[i];
            maxSum=Math.max(maxSum,lSum);
        }
        int j=nums.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=nums[i];
            rSum+=nums[j];
            maxSum=Math.max(maxSum,lSum+rSum);
            j--;
        }
        return maxSum;
        
    }
}