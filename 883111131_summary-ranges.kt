id = 883111131 
lang = kotlin 
runtime  = 171 ms 
memory = 35.5 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        var (l, r) = 0 to 0
        val list = mutableListOf<String>()

        while(r < nums.size) {
            if (r + 1 < nums.size && nums[r] + 1 == nums[r + 1]) {
                r++
            } else {
                
                if (r == l) list.add("${nums[r]}")
                else list.add("${nums[l]}->${nums[r]}")
                
                r++
                l = r
            }
        }
        return list.toList()
    }
}