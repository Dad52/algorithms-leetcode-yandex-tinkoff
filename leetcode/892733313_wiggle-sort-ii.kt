id = 892733313 
lang = kotlin 
runtime  = 326 ms 
memory = 41.7 MB
title_slug = wiggle-sort-ii
code =

 class Solution {
    fun wiggleSort(nums: IntArray): Unit {
        val pq = nums.sortedDescending()
        var k = 0
        var mid = nums.size / 2

        for (i in 0 until nums.size) {
            if (i % 2 == 0) {
                nums[i] = pq[mid++]
            } else {
                nums[i] = pq[k++]
            }
        }
    }
}