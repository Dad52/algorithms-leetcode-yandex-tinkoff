id = 887589356 
lang = java 
runtime  = 0 ms 
memory = 39.5 MB
title_slug = house-robber
code =

 class Solution {
    public int rob(int[] nums) {
        int inc = nums[0];
        int exc = 0;
        
        //next exclude is max if previous excluse and include.
        //next include is previous exclude + current
        for(int i=1;i<nums.length;i++){
            int finc = exc + nums[i];
            int nexc = Math.max(inc , exc);
            
            inc = finc;
            exc = nexc;
            
        }
        
        return Math.max(inc, exc);
    }
}