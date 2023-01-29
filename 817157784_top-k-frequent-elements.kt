id = 817157784 
lang = kotlin 
runtime  = 540 ms 
memory = 51.9 MB
title_slug = top-k-frequent-elements
code =

 class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        val hashMap = HashMap<Int, Int>()
        
        nums.forEach() { num ->
            hashMap[num] = hashMap.getOrDefault(num, 0) + 1
        }
        
        val result = mutableListOf<Int>()
        
        val sortedHashMap = hashMap.toList().sortedByDescending{ it.second }
        
        for (i in 0 until k) {
            result.add(sortedHashMap[i].first)
        }
        
        return result.toIntArray()
    }
}