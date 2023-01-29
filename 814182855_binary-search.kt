id = 814182855 
lang = kotlin 
runtime  = 519 ms 
memory = 64.8 MB
title_slug = binary-search
code =

 class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        var low = 0
        var high = nums.size - 1
        
        while (low <= high) {
            val mid = low + (high - low) / 2
            val midNum = nums[mid]
            if (midNum == target) 
                return mid
            else if (midNum > target)
                high = mid - 1
            else
                low = mid + 1
        }
        
        return -1
        
    }
}