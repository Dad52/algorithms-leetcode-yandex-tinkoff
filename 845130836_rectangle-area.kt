id = 845130836 
lang = kotlin 
runtime  = 354 ms 
memory = 37.2 MB
title_slug = rectangle-area
code =

 class Solution {
    fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
        
        val a1 = (ax2 - ax1) * (ay2 - ay1)
        val a2 = (bx2 - bx1) * (by2 - by1)
        
        val x5 = Math.max(ax1, bx1)
        val y5 = Math.max(ay1, by1)
        val x6 = Math.min(ax2, bx2)
        val y6 = Math.min(ay2, by2)
        
        val x = x6 - x5;
        val y = y6 - y5;
        var a3 = x * y;
        
        if (x < 0 || y < 0)
            a3 = 0
        
        return a1 + a2 - a3
    }
}
