class Solution {
    public int findMin(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left);
            min=Math.min(arr[mid],min);
            if(arr[right]<arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return min;
        
    }
}