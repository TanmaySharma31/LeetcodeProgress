class Solution {
    public int countStaircase(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer> map=new LinkedHashMap<>();
            for(int j=i;j<n;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                int expV=1;
                boolean valid=true;
                for(int num:map.values()){
                    if(num!=expV){
                        valid=false;
                        break;
                    }
                    expV++;
                }
                if(valid){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}