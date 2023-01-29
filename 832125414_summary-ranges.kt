id = 832125414 
lang = kotlin 
runtime  = 262 ms 
memory = 34.3 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        val result = mutableListOf<String>()
        
        var (left, right) = 0 to 0
        
        while (right < nums.size) {
            if (right < nums.size - 1 && nums[right + 1] == nums[right] + 1) {
                right++
            } else {
                val str = if (nums[left] == nums[right]) "${nums[left]}" else "${nums[left]}->${nums[right]}"
                result.add(str)
                right++
                left = right
            }
        }
        
        return result
    }
}