id = 892677844 
lang = kotlin 
runtime  = 504 ms 
memory = 62.6 MB
title_slug = count-primes
code =

 class Solution {
    fun countPrimes(n: Int): Int {
        val notPrime = Array<Boolean>(n) { false }
        var ans = 0

        for (i in 2 until n) {
            if (notPrime[i] == false) {
                ans++
                var j = 2
                while (i * j < n) {
                    notPrime[i * j] = true
                    j++
                }
            }
        }

        return ans
    }
}