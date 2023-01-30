id = 887468344 
lang = kotlin 
runtime  = 240 ms 
memory = 37.4 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        //TEST
        nums.forEachIndexed() { i, num ->
            val diff = target - num

            if (hashMap.contains(diff))
                return intArrayOf(i, hashMap.getOrDefault(diff, 0))

            hashMap[num] = i

        }

        return intArrayOf(0, 0)
    }
}