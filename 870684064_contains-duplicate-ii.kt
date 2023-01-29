id = 870684064 
lang = kotlin 
runtime  = 670 ms 
memory = 54.1 MB
title_slug = contains-duplicate-ii
code =

 class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()

        nums.forEachIndexed() { i, num ->
            if (map.contains(num)) {
                if (i - map.getOrDefault(num, 0) <= k)
                    return true
            }
            map[num] = i
        }

        return false
    }
}