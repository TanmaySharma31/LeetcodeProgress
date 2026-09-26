class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(List<String> pair:knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<s.length()){
            
            if(s.charAt(i)=='('){
                i++;
                
                StringBuilder key=new StringBuilder();
                while(s.charAt(i)!=')'){
                    key.append(s.charAt(i));
                    i++;

                }
                String k=key.toString();
                if(map.containsKey(k)){
                    ans.append(map.get(k));
                }else{
                    ans.append("?");
                }
                i++;
            }
            else{
                ans.append(s.charAt(i));
                i++;
            }

        }
        return ans.toString();
        
    }
}