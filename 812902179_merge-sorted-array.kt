id = 812902179 
lang = kotlin 
runtime  = 346 ms 
memory = 37.5 MB
title_slug = merge-sorted-array
code =

 class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        
        var second = 0
        
        for (index in 0 until nums1.size) {
            if (nums1[index] == 0 && second < nums2.size) {
                nums1[index] = nums2[second++]
            }
        }
        
        nums1.sort() 
        
    }
}