class Solution {
    public int smallestDivisor(int[] arr, int limit) {
        int max=Integer.MIN_VALUE;
        for(int nums:arr){
            max=Math.max(nums,max);
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int nums:arr){
                sum+=(int)Math.ceil((double) nums/mid);
            }
            if(sum<=limit){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;

        
    }
}