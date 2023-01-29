id = 693167584 
lang = kotlin 
runtime  = 392 ms 
memory = 40.1 MB
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