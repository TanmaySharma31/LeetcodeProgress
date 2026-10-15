class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int nums:piles){
            max=Math.max(nums,max);

        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long hours=0;
            for(int nums:piles){
                hours+=(nums+(long)mid-1)/mid;            
            }
            if(hours<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}