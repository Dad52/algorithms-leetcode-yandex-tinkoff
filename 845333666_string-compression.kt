id = 845333666 
lang = kotlin 
runtime  = 325 ms 
memory = 39.6 MB
title_slug = string-compression
code =

 class Solution {
    fun compress(chars: CharArray): Int {
        var sb = StringBuilder()
        
        sb.append(chars[0])
        var count = 1
        
        for (i in 1 until chars.size) {
            if (chars[i] == chars[i - 1]) 
                count++
            else {
                if (count > 1) {
                    sb.append(count)
                    count = 1
                }
                sb.append(chars[i])
            }
        }
        
        if (count > 1)
            sb.append(count)
        
        var i = 0
        
        sb.forEach() {
            chars[i++] = it  
        }
        
        return sb.length
    }
}