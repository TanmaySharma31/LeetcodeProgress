class Solution {
     public String minWindow(String s, String t) {
    // your code goes here
    int n=s.length();
    int m=t.length();
    int[] mapS=new int[128];
    int[] mapT=new int[128];

    for(char ch:t.toCharArray()){
        mapT[ch]++;
    }
    int right=0;
    String ans="";
    int min=Integer.MAX_VALUE;
    for( int i=0;i<n;i++){
        while(right<n && !isCompatible(mapS,mapT)){
            mapS[s.charAt(right)]++;
            right++;
        }
        if(isCompatible(mapS,mapT)){
            if(right-i<min){
                min=right-i;
                ans=s.substring(i,right);
            }
        }
        mapS[s.charAt(i)]--;
    }
    return ans;
  }
  public boolean isCompatible(int[] mapS,int[] mapT){
    for(int i=0;i<128;i++){
        if(mapS[i]<mapT[i]){
            return false;
        }

    }
    return true;
  }
}