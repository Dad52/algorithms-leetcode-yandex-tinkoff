id = 894084251 
lang = kotlin 
runtime  = 234 ms 
memory = 37.6 MB
title_slug = jump-game-ii
code =

 class Solution {
    fun jump(nums: IntArray): Int {
        var ans = 0

        var (l, r) = 0 to 0

        while (r < nums.size - 1) {
            var far = 0

            for (i in l..r) 
                far = Math.max(far, i + nums[i])
            
            l = r + 1
            r = far
            ans++
        }

        return ans
    }
}
