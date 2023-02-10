id = 895503938 
lang = kotlin 
runtime  = 186 ms 
memory = 35.8 MB
title_slug = maximum-product-of-two-elements-in-an-array
code =

 class Solution {
    fun maxProduct(nums: IntArray): Int {
        nums.sortDescending()
        return (nums[0] - 1) * (nums[1] - 1)
    }
}