class Solution {
    public int splitArray(int[] nums, int k) {
        
        long left=0;
        long right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        if(k==1){
            return (int)right;
        }
        while(left<=right){
            long mid=(left+(right-left)/2);
            if(isPossible(nums,k,mid)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return (int)left;
        
    }
    public boolean isPossible(int[] arr,int k,long limit){
        int parts=1;
        int total=0;
        for(int nums:arr){
            if(total+nums<=limit){
                total+=nums;
            }else{
                parts++;
                total=nums;
                if(parts>k){
                    return false;
                }
            }
        }
        return true;
    }
}