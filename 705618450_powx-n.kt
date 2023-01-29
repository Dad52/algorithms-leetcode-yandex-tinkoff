id = 705618450 
lang = kotlin 
runtime  = 189 ms 
memory = 36.8 MB
title_slug = powx-n
code =

 class Solution {
    fun myPow(x: Double, n: Int): Double {

        if (n == Int.MIN_VALUE) return myPow(x * x, n / 2)

        if (n == 0) return 1.0

        if (n == 1) return x

        if (n < 0) return myPow(1/x, -n)

        if (n % 2 == 0) return myPow(x * x, n / 2)
        else return x * myPow(x * x, n / 2)

    }
}