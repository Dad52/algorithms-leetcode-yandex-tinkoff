id = 686546430 
lang = kotlin 
runtime  = 520 ms 
memory = 64.9 MB
title_slug = binary-search
code =

 class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        var low = 0
        var high = nums.size - 1
        
        while (low <= high) {
            
            var mid = low + (high - low) / 2
            var chosenNumber = nums[mid]
            
            if (chosenNumber == target) {
                return mid
            } else if (chosenNumber < target) {
                low = mid + 1
            } else {
                high = mid - 1
            } 
        }
        return -1
        
    }
}