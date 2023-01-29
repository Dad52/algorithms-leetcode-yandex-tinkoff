id = 689154397 
lang = kotlin 
runtime  = 336 ms 
memory = 43.3 MB
title_slug = missing-number
code =

 class Solution {
    fun missingNumber(nums: IntArray): Int {
        
        val hash = HashMap<Int, Int>(nums.size)

        for (index in 0 until nums.size) {
            hash[index] = 0
        }

        nums.forEach { num ->
            hash[num] = 1
        }

        println(hash)

        hash.forEach { n ->
            if (n.value == 0) return n.key
        }

        return nums.sorted().last() + 1
        
    }
}