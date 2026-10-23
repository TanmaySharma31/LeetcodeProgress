class Solution {
    public int sortPermutation(int[] nums) {
        int result=-1;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(i!=nums[i]){
                result &=nums[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return result;
        
    }
}