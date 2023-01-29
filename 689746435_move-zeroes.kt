id = 689746435 
lang = kotlin 
runtime  = 614 ms 
memory = 64 MB
title_slug = move-zeroes
code =

 class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastNonZero = 0
        for (n in nums) {
            if (n != 0) {
                nums[lastNonZero] = n
                lastNonZero++
            }
        }
        for (index in lastNonZero until nums.size) {
            nums[index] = 0
        }
    }
}