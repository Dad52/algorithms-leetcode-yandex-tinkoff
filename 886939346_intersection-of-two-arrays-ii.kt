id = 886939346 
lang = kotlin 
runtime  = 207 ms 
memory = 36.6 MB
title_slug = intersection-of-two-arrays-ii
code =

 class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val list = mutableListOf<Int>()
        nums1.sort()
        nums2.sort()

        var (i, j) = 0 to 0

        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j])
                i++
            else if (nums1[i] > nums2[j])
                j++
            else {
                list.add(nums1[i])
                i++
                j++
            }
        }
        
        return list.toIntArray() 
    }
}