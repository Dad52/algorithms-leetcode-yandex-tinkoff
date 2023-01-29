id = 812760553 
lang = kotlin 
runtime  = 385 ms 
memory = 41.9 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val hashMap = HashMap<Int, Int>()
        
        nums.forEachIndexed { index, num ->
            
            val diff = target - num
            
            if (hashMap.containsKey(diff)) {
                return intArrayOf(index, hashMap.getOrDefault(diff, 0))
            }
            
            hashMap[num] = index
            
        }
        
        return intArrayOf(-1, -1)
    }
}