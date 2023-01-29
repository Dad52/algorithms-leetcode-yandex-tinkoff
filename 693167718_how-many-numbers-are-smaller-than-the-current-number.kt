id = 693167718 
lang = kotlin 
runtime  = 340 ms 
memory = 40.6 MB
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