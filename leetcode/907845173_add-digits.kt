id = 907845173 
lang = kotlin 
runtime  = 136 ms 
memory = 34.2 MB
title_slug = add-digits
code =

 class Solution {
    fun addDigits(num: Int): Int {
        var result = num.toString()
        while(result.length > 1) {
            var curr = 0
            result.forEach() {
                curr += it.toString().toInt()
            }
            result = curr.toString()
        }
        return result.toInt()
    }
}