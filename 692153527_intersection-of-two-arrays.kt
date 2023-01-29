id = 692153527 
lang = kotlin 
runtime  = 267 ms 
memory = 38.9 MB
title_slug = intersection-of-two-arrays
code =

 class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        
        val set1 = HashSet<Int>()

        nums1.forEach { num ->
            set1.add(num)
        }

        val inters = mutableListOf<Int>()

        nums2.forEach { num ->
            if (set1.contains(num)) {
                inters.add(num)
                set1.remove(num)
            }
        }
        println(inters)
        return inters.toIntArray()
        
    }
}