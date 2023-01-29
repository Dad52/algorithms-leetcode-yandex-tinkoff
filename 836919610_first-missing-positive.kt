id = 836919610 
lang = kotlin 
runtime  = 1342 ms 
memory = 102.7 MB
title_slug = first-missing-positive
code =

 class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        
        var n = nums.size
        
        for (i in 0 until n) {
            if (nums[i] < 0)
                nums[i] = 0
        }
        
        println(nums.toList())
        
        for (i in 0 until n) {
            val num = Math.abs(nums[i])
            if (num >= 1 && num <= n) {
                if (nums[num - 1] > 0)
                    nums[num - 1] *= -1
                else if (nums[num - 1] == 0)
                    nums[num - 1] = -1 * (n + 1)
            }
        }
        
        println(nums.toList())
        
        for (i in 0 until n) {
            if (nums[i] >= 0)
                return i + 1
        }
        return n + 1
        
    }
}