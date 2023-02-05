id = 891958079 
lang = kotlin 
runtime  = 205 ms 
memory = 37.8 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        nums.forEachIndexed() { i, num ->
            val diff = target - num

            if (map.containsKey(diff))
                return intArrayOf(map.getOrDefault(diff, 0), i)

            map[num] = i
        }

        return intArrayOf(0, 0)
    }
}