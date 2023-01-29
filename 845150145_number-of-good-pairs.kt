id = 845150145 
lang = kotlin 
runtime  = 251 ms 
memory = 34.4 MB
title_slug = number-of-good-pairs
code =

 class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        
        val hashMap = HashMap<Int, Int>()
        var res = 0
        
        nums.forEach() {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        
        nums.forEach() {
            if (hashMap.contains(it)) {
                res += hashMap.getOrDefault(it, 0) * (hashMap.getOrDefault(it, 0) - 1) / 2
                hashMap.remove(it)
            }
        }
        
        return res
    }
}
