class Solution {
    public int minDays(int[] bloomday, int m, int k) {
        if(bloomday.length<((long)m*k)){
            return -1;
        }
        int maxi=0;
        for(int nums:bloomday){
            maxi=Math.max(nums,maxi);
        }
        int left=1;
        int right=maxi;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            int b_count=0;
            for(int i:bloomday){
                if(mid>=i){
                    count++;
                    if(count==k){
                        b_count++;
                        count=0;
                    }
                }else{
                    count=0;
                }
            }
            if(b_count>=m){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
        
    }
}