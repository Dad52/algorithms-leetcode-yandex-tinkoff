id = 686530311 
lang = kotlin 
runtime  = 232 ms 
memory = 36.9 MB
title_slug = search-insert-position
code =

 class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        
        var low = 0
        var high = nums.size - 1
        
        while (low <= high) {
            
            var mid = low + (high - low) / 2
            
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] > target) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return high + 1
    }
}