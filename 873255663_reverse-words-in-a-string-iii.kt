id = 873255663 
lang = kotlin 
runtime  = 253 ms 
memory = 36.9 MB
title_slug = reverse-words-in-a-string-iii
code =

 class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        val temp = StringBuilder()

        s.trim().forEach() { ch ->
            if (ch == ' ') {
                val str = temp.toString().reversed() + " "
                sb.append(str)
                temp.clear()
                return@forEach
            }
            temp.append(ch)
        }

        val str = temp.toString().reversed()
        sb.append(str)

        return sb.toString()
    }
}