id = 707553517 
lang = kotlin 
runtime  = 192 ms 
memory = 33.5 MB
title_slug = number-of-1-bits
code =

 class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var count = 0
        var num = n
        while (num != 0) {
            if (num and 1 != 0) count++
            num = num ushr 1
        }
        return count
    }
}