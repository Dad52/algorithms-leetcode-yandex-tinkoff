id = 703907875 
lang = kotlin 
runtime  = 436 ms 
memory = 55.3 MB
title_slug = single-number
code =

 class Solution {
    fun singleNumber(nums: IntArray): Int {

        val hash = HashMap<Int, Int>()

        nums.forEach { num -> 
            if (hash.containsKey(num)) {
                val frequency = hash.getValue(num)
                hash.put(num, frequency + 1)
            } else {
                hash.put(num, 1)
            }
        }

        hash.forEach() { num ->
            if (num.value == 1) return num.key
        }

        return -1

    }
}