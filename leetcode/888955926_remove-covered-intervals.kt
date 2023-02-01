id = 888955926 
lang = kotlin 
runtime  = 236 ms 
memory = 38.4 MB
title_slug = remove-covered-intervals
code =

 class Solution {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        intervals.sortWith(compareBy({ it[0] }, { -it[1] }))
        
        var currE = Int.MIN_VALUE
        var count = 0

        intervals.forEach() {
            val end = it[1]

            if (currE < end) {
                currE = end
                count++
            }
        }

        return count
    }
}