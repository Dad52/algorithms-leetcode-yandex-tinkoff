id = 894198906 
lang = kotlin 
runtime  = 164 ms 
memory = 35.4 MB
title_slug = reverse-integer
code =

 class Solution {
    fun reverse(x: Int): Int {

        var negative = false
        var sb = StringBuilder()
        var str = x.toString().reversed()
        
        str.forEach() {
            if (it == '-' || (sb.length == 0 && it == '0'))
                return@forEach
            
            sb.append(it)
        }

        if (sb.length == 0) sb.append(0)

        val ans = try {
            if (x < 0) sb.toString().toInt() * -1 else sb.toString().toInt()
        } catch (e: Exception) {
            0
        }

        return ans
    }
}