id = 745972138 
lang = kotlin 
runtime  = 487 ms 
memory = 44.9 MB
title_slug = remove-duplicates-from-sorted-array
code =

 class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        
        var left = 1

        for (right in 1 until nums.size) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right]
                left++
            }
        }

        return left
    }
}