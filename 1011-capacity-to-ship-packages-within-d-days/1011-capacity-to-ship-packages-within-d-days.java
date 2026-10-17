class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int nums:weights){
            max=Math.max(max,nums);
            sum+=nums;
        }
        int left=max;
        int right=sum;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum2=0;
            int dayCount=1;
            for(int nums:weights){
                if(sum2+nums > mid){
                    dayCount++;
                    sum2=0;
                }
                sum2+=nums;
            }
            if(dayCount<=days){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
        
    }
}