id = 838797229 
lang = kotlin 
runtime  = 1808 ms 
memory = 179.8 MB
title_slug = 3sum
code =

 class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        
        if (nums.size < 3)
            return emptyList()

        nums.sort()
            
        val set = HashSet<List<Int>>()
        
        for (i in 0 until nums.size - 2) {
            var lo = i + 1
            var hi = nums.size - 1
            
            while (lo < hi) {
                val sum = nums[i] + nums[lo] + nums[hi]
                if (sum == 0) {
                    set.add(listOf(nums[i], nums[lo], nums[hi]))
                    lo++
                    hi--
                } else if (sum > 0) {
                    hi--
                } else {
                    lo++
                }
            }
        }
        
        return set.toList()        
    }
}