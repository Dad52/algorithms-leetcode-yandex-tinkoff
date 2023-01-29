id = 689115488 
lang = kotlin 
runtime  = 531 ms 
memory = 46.2 MB
title_slug = contains-duplicate
code =

 class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        val hash = hashMapOf<Int, Int>()

        for (num in nums) {
            if (!hash.containsKey(num)) {
                hash.put(num, 1)
            } else {
                val frequency = hash.getValue(num)
                hash.put(num, frequency + 1)
            }
        }

        for (num in hash.keys) {
            if (hash.getValue(num) >= 2) return true
        }

         return false
    }
}