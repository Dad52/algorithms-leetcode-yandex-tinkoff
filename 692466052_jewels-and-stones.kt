id = 692466052 
lang = kotlin 
runtime  = 192 ms 
memory = 36.3 MB
title_slug = jewels-and-stones
code =

 class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val charsStones = stones.toCharArray()
        val charsJewels = jewels.toHashSet()
        var result = 0

        charsStones.forEach { stone ->
            if (charsJewels.contains(stone)) result++
        }

        return result
    }
}