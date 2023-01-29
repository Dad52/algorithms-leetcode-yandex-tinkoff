id = 836917867 
lang = kotlin 
runtime  = 597 ms 
memory = 72.8 MB
title_slug = first-missing-positive
code =

 class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        
        var n = nums.size
        
        for (i in 0 until n) {
            if (nums[i] < 0)
                nums[i] = 0
        }
        
        for (i in 0 until n) {
            val num = Math.abs(nums[i])
            if (num >= 1 && num <= n) {
                if (nums[num - 1] > 0)
                    nums[num - 1] *= -1
                else if (nums[num - 1] == 0)
                    nums[num - 1] = -1 * (n + 1)
            }
        }
        
        for (i in 1 until n + 1) {
            if (nums[i - 1] >= 0)
                return i
        }
        return n + 1
        
    }
}