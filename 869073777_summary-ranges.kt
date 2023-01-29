id = 869073777 
lang = kotlin 
runtime  = 189 ms 
memory = 35.7 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        var (left, right) = 0 to 0
        val list = mutableListOf<String>()

        while (right < nums.size) {
            
            if (right + 1 < nums.size && nums[right + 1] == nums[right] + 1) {
                right++
            } else {
                val range = if (left == right) "${nums[left]}" else "${nums[left]}->${nums[right]}"
                list.add(range)
                right++
                left = right
            }
        }

        return list.toList()

    }
}