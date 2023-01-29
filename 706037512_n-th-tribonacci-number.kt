id = 706037512 
lang = kotlin 
runtime  = 208 ms 
memory = 33.4 MB
title_slug = n-th-tribonacci-number
code =

 class Solution {
    fun tribonacci(n: Int): Int {

        var t0 = 0 // n
        var t1 = 1 // n + 1
        var t2 = 1 // n + 2

        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        if (n == 3) return 2

        for (index in 3..n) {
            val sum = t0 + t1 + t2
            t0 = t1
            t1 = t2
            t2 = sum
        }
        return t2
    }
}