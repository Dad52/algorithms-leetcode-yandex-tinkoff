id = 887051123 
lang = kotlin 
runtime  = 358 ms 
memory = 40.7 MB
title_slug = squares-of-a-sorted-array
code =

 class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var (l, r) = 0 to nums.size - 1

        val list = mutableListOf<Int>()

        while (l <= r) {
            val leftNum = nums[l] * nums[l]
            val rightNum = nums[r] * nums[r]

            if (leftNum > rightNum) {
                list.add(leftNum)
                l++
            } else {
                list.add(rightNum)
                r--
            }
        }

        return list.toList().reversed().toIntArray()
    }
}