id = 749656824 
lang = kotlin 
runtime  = 332 ms 
memory = 41.1 MB
title_slug = jump-game
code =

 class Solution {
    fun canJump(nums: IntArray): Boolean {
        
        var goal = nums.size - 1
        
        for (i in nums.size - 1 downTo 0) {
            if (i + nums[i] >= goal)
                goal = i
        }
        return goal == 0
    }
}