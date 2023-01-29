id = 696671507 
lang = kotlin 
runtime  = 347 ms 
memory = 35.7 MB
title_slug = create-target-array-in-the-given-order
code =

 class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val arr = mutableListOf<Int>()

        nums.forEachIndexed { i, num -> arr.add(index[i],num) }

        return arr.toIntArray()
    }
}