id = 693166556 
lang = kotlin 
runtime  = 381 ms 
memory = 42.1 MB
title_slug = how-many-numbers-are-smaller-than-the-current-number
code =

 class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {

        val smallerNums = mutableListOf<Int>()

        nums.forEach {num ->
            smallerNums.add(nums.count { it < num })
        }

        return smallerNums.toIntArray()
    
    }
}