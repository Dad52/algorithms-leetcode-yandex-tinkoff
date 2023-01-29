id = 839465072 
lang = kotlin 
runtime  = 263 ms 
memory = 35.1 MB
title_slug = make-the-string-great
code =

 class Solution {
    fun makeGood(s: String): String {
        var buf = StringBuffer(s)
        
        for (i in buf.length - 2 downTo 0) {
            if (i > buf.length - 2)
                continue
            if (buf[i] != buf[i + 1] && buf[i].toLowerCase() == buf[i + 1].toLowerCase())
                buf.delete(i, i + 2)
        }
        
        return buf.toString()
    }
}