id = 895766507 
lang = kotlin 
runtime  = 152 ms 
memory = 34 MB
title_slug = make-array-zero-by-subtracting-equal-amounts
code =

 class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val set = HashSet<Int>()
        nums.forEach() { if(it != 0) set.add(it) }

        return set.size
    }
}