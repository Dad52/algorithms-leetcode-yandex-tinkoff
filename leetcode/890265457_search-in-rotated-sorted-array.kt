id = 890265457 
lang = kotlin 
runtime  = 179 ms 
memory = 35.9 MB
title_slug = search-in-rotated-sorted-array
code =

 class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex

        while (l <= r) {
            val mid = l + (r - l) / 2

            if (nums[mid] == target)
                return mid
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid])
                    r = mid - 1
                else 
                    l = mid + 1
            } else {
                if (nums[mid] < target && target <= nums[r])
                    l = mid + 1
                else
                    r = mid - 1
            }
        }
        return -1
    }
}