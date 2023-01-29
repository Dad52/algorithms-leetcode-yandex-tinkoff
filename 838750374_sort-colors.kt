id = 838750374 
lang = kotlin 
runtime  = 331 ms 
memory = 37.4 MB
title_slug = sort-colors
code =

 class Solution {
    fun sortColors(nums: IntArray): Unit {
        
        var left = 0
        var i = 0
        var right = nums.lastIndex
        while (i <= right) {
            when(nums[i]) {
                0 -> { nums[left] = nums[i].also { nums[i++] = nums[left++] } }
                2 -> { nums[right] = nums[i].also { nums[i] = nums[right--] } }
                else -> { i++ }
            }
        }
    }
}