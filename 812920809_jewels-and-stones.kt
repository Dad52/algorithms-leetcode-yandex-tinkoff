id = 812920809 
lang = kotlin 
runtime  = 266 ms 
memory = 34.7 MB
title_slug = jewels-and-stones
code =

 class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        
        val hashMap = HashMap<Char, Int>()
        var count = 0
        
        jewels.forEach {
            hashMap[it] = 0
        }
        
        stones.forEach { ch ->
            if (hashMap.containsKey(ch)) count++
        }
        
        return count
        
    }
}