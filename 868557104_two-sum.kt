id = 868557104 
lang = kotlin 
runtime  = 227 ms 
memory = 37.9 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        
        nums.forEachIndexed() { index, num ->
            val diff = target - num

            if (hashMap.contains(diff))
                return intArrayOf(hashMap.getOrDefault(diff, 0), index)

            hashMap[num] = index
        }

        return intArrayOf(0, 0)
    }
}