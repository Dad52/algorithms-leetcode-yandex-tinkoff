id = 705607812 
lang = kotlin 
runtime  = 266 ms 
memory = 35.3 MB
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