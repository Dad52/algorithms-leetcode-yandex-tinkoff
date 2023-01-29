id = 689232955 
lang = kotlin 
runtime  = 424 ms 
memory = 36.9 MB
title_slug = kth-missing-positive-number
code =

 class Solution {
    fun findKthPositive(nums: IntArray, k: Int): Int {
        
        val len = nums.size + k*2
        val hash = HashMap<Int, Int>(len)
        var index = 0


        for (key in 1 until len) {
            hash[key] = 0
        }

        println(hash)

        nums.forEach { num ->
            hash[num] = 1
        }

        println(hash)

        hash.forEach {
            if (it.value == 0) index++
            println("index: $index = $k :k")
            if (index == k) return it.key

        }

        return -1
    }
}