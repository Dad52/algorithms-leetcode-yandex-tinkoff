id = 838835124 
lang = kotlin 
runtime  = 747 ms 
memory = 78.2 MB
title_slug = merge-intervals
code =

 class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        
        val result = mutableListOf<IntArray>()
        
        intervals.sortBy { it.first() }
        
        result.add(intervals.first())
        
        for (itv in intervals) {
            var prev = result[result.lastIndex]
            
            if (prev[1] >= itv[0]) {
                prev[1] = Math.max(itv[1], prev[1])
            } else {
                result.add(itv)
            }
        }
        
        return result.toTypedArray()
    }
}