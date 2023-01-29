id = 836910204 
lang = kotlin 
runtime  = 654 ms 
memory = 73.1 MB
title_slug = first-missing-positive
code =

 class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        var n = nums.size
        
        for (i in 0 until n) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        
        for (i in 0 until n) {
            
            var num = Math.abs(nums[i]);
            
            if (num > n) continue
            
            num--
            
            if (nums[num] > 0) 
                nums[num] = -1 * nums[num];
            
        }
        
        for (i in 0 until n) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        
        return n + 1
    }
}
