id = 891888018 
lang = kotlin 
runtime  = 156 ms 
memory = 35.5 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val list = mutableListOf<String>()
        
        var (l, r) = 0 to 0

        while (r < nums.size) {
            if (r + 1 < nums.size && nums[r] + 1 == nums[r + 1]) {
                r++
            } else {
                if (l == r) list.add("${nums[r]}") else list.add("${nums[l]}->${nums[r]}")
                r++
                l = r
            }
        }

        return list.toList()
    }
}
