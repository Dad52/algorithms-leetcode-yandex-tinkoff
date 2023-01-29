id = 833304175 
lang = kotlin 
runtime  = 225 ms 
memory = 37.8 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val hashMap = HashMap<Int, Int>()
        
        nums.forEachIndexed() { index, key ->
            val need = target - key
            if (hashMap.containsKey(need))
                return intArrayOf(hashMap.getOrDefault(need, -1), index)
                
            hashMap[key] = index
        }
        
        return intArrayOf(-1, -1)
    }
}