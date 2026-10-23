class Solution {
    public int sortPermutation(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                list.add(nums[i]);
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        int result=list.get(0);
        for(int i=1;i<list.size();i++){
            result=result & list.get(i);
        }
        return result;
        
        
    }
}