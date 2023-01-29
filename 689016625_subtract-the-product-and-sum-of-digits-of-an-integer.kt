id = 689016625 
lang = kotlin 
runtime  = 118 ms 
memory = 32.9 MB
title_slug = subtract-the-product-and-sum-of-digits-of-an-integer
code =

 class Solution {
    fun subtractProductAndSum(n: Int): Int {
        
        val arr = ArrayList<Int>()
        var num = n
        var sum = 0
        var product = 1
        
        while (num > 0) {
            arr.add(num%10)
            num /=10
        }
        
        for (index in 0 until arr.size) {
            sum += arr[index]
            product *= arr[index]
        }
        
        return product - sum
        
    }
}