id = 813553866 
lang = kotlin 
runtime  = 424 ms 
memory = 46.5 MB
title_slug = product-of-array-except-self
code =

 class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        
        val list = mutableListOf<Int>()
        
        list.add(1)
        
        for (index in 1 until nums.size) {
            list.add(nums[index - 1] * list[index - 1])
        }
        println(list)
        
        var curr = 1
        
        for (index in nums.size - 2 downTo 0) {
            curr *= nums[index + 1]
            list[index] *= curr
        }
        
        return list.toIntArray()
    }
}