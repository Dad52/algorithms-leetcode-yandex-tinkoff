id = 705473980 
lang = kotlin 
runtime  = 663 ms 
memory = 81 MB
title_slug = container-with-most-water
code =

 class Solution {
    fun maxArea(height: IntArray): Int {
        
        var maxArea = 0
        
        var l = 0
        var r = height.size - 1
        
        while(l < r) {
            
            val currArea = (r - l) * minOf(height[l], height[r])
            maxArea = maxOf(maxArea, currArea)
            
            if (height[l] > height[r]) {
                r--
            } else {
                l++
            }
            
        }
        return maxArea
    }
}