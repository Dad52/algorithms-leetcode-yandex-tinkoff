id = 812120772 
lang = kotlin 
runtime  = 290 ms 
memory = 34.9 MB
title_slug = summary-ranges
code =

 class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        val resultList = mutableListOf<String>()
        var (start, end) = 0 to 0
        
        while(end < nums.size) {
            if (end < nums.size - 1 && nums[end] + 1 == nums[end + 1]) {
                end++
            } else {
                val result = if (start == end) "${nums[start]}" else "${nums[start]}->${nums[end]}"
                resultList.add(result)
                end++
                start = end
            }
        }
            
        return resultList
    }
}