id = 873166711 
lang = kotlin 
runtime  = 154 ms 
memory = 33.2 MB
title_slug = sqrtx
code =

 class Solution {
    fun mySqrt(x: Int): Int {
        var l = 1
        var r = x

        while (l <= r) {
            val mid = (l + r) / 2

            if (x / mid == mid)
                return mid
            else if (x / mid < mid)
                r = mid - 1
            else
                l = mid + 1

        }

        return r
    }
}