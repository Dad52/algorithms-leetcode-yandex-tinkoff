id = 907851899 
lang = kotlin 
runtime  = 180 ms 
memory = 36.7 MB
title_slug = string-compression
code =

 class Solution {
    fun compress(chars: CharArray): Int {
        var curr = 1
        var (l, r) = 0 to 1

        if (chars.size == 1)
            return 1

        while (r < chars.size) {
            if (chars[r] == chars[r - 1]) {
                curr++
            } else {
                if (curr == 1) {
                    chars[l++] = chars[r - 1]
                } else {
                    chars[l++] = chars[r - 1]
                    for (i in 0 until "$curr".length) {
                        chars[l++] = "$curr"[i]
                    }
                    
                    curr = 1
                }
            }
            r++
        }

        if (chars[chars.lastIndex] == chars[chars.lastIndex - 1]) {
            chars[l++] = chars[chars.lastIndex - 1]
            for (i in 0 until "$curr".length) {
                chars[l++] = "$curr"[i]
            }
        } else {
            chars[l++] = chars[chars.lastIndex]
        }

    
        return l
    }
}
                   
//["b", "a", "a", "a"] -> l = 1 -> return 3 = right
              
//["a", "a", "a", "b"]