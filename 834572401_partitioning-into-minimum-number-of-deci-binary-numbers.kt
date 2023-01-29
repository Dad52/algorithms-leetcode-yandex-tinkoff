id = 834572401 
lang = kotlin 
runtime  = 241 ms 
memory = 36.8 MB
title_slug = partitioning-into-minimum-number-of-deci-binary-numbers
code =

 class Solution {
    fun minPartitions(n: String): Int {
        var max = 0
        
        for (i in 0 until n.length) {
            val digit = n[i] - '0'
            max = Math.max(max, digit)
        }
        return max
    }
}
