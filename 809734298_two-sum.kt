id = 809734298 
lang = kotlin 
runtime  = 390 ms 
memory = 42.4 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val hashMap = HashMap<Int, Int>()

        nums.forEachIndexed() { index, num ->
            val result = target - num
            if (hashMap.containsKey(result))
                return intArrayOf(index, hashMap.getValue(result))

            hashMap[num] = index
        }
        return intArrayOf(-1, -1)
    }
}