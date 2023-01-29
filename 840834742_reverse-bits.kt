id = 840834742 
lang = kotlin 
runtime  = 265 ms 
memory = 33.2 MB
title_slug = reverse-bits
code =

 class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
        var res = 0
        
        for (i in 0 until 32) {
            res = (res shl 1) or ((n ushr i) and 1)
        }
        
        return res
    }
}