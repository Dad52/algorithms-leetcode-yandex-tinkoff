id = 870681117 
lang = kotlin 
runtime  = 541 ms 
memory = 52 MB
title_slug = contains-duplicate-ii
code =

 class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

        if (nums.size <= k) {
            val set = HashSet<Int>()
            nums.forEach() { set.add(it) }
            return set.size != nums.size
        }

        val set = HashSet<Int>()

        var right = 0

        while (right <= k) {
            set.add(nums[right++])
        }

        if (set.size <= k)
            return true

        while (right < nums.size) {
            set.remove(nums[right - k - 1])
            set.add(nums[right++])
            if (set.size <= k)
                return true
        }

        return false
    }
}