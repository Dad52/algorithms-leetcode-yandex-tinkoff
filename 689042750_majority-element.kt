id = 689042750 
lang = kotlin 
runtime  = 294 ms 
memory = 42.9 MB
title_slug = majority-element
code =

 class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        val hash = hashMapOf<Int, Int>()

        for (num in nums) {
            if (hash.containsKey(num)) {
                val frequency = hash.getValue(num)
                hash.put(num, frequency + 1)
            } else {
                hash.put(num, 1)
            }
        }

        for (num in hash.keys) {
            if (hash.getValue(num) > nums.size / 2) return num
        }

        return -1
        
    }
}