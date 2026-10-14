class Solution {
    public int mySqrt(int x) {
        long left=1;
        long right=x;
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid>x){
                right=mid-1;
            }else{
                ans=mid;
                left=mid+1;
            }
        }
        return (int)ans;
        
    }
}