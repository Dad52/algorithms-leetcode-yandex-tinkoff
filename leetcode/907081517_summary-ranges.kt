id = 907081517 
lang = kotlin 
runtime  = 153 ms 
memory = 36 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        var (l, r) = 0 to 0
        val list = mutableListOf<String>()

        while (r != nums.size) {
            if (r + 1 != nums.size && nums[r] + 1 == nums[r + 1]) {
                r++
            } else {
                list.add(if (l == r) "${nums[l]}" else "${nums[l]}->${nums[r]}")
                r++
                l = r
            }
        }

        return list.toList()
    }
}
