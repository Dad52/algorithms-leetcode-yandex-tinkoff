id = 873250039 
lang = kotlin 
runtime  = 159 ms 
memory = 33.3 MB
title_slug = valid-perfect-square
code =

 class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var (l, r) = 1 to num

        while (l <= r) {
            val mid = (l + r) / 2

            println("$num / $mid == $mid")

            if (num.toDouble() / mid.toDouble() == mid.toDouble())
                return true
            else if (num / mid < mid)
                r = mid - 1
            else 
                l = mid + 1
        }

        return false
    }
}