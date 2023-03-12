id = 913786884 
lang = kotlin 
runtime  = 133 ms 
memory = 33.6 MB
title_slug = goal-parser-interpretation
code =

 class Solution {
    fun interpret(str: String): String {
        val sb = StringBuilder()
        
        for (i in 0 until str.length) {
            if (str[i] == 'G')
                sb.append('G')
            else if (i + 1 < str.length && str[i] == 'a' && str[i + 1] == 'l')
                sb.append("al")
            else if (i + 1 < str.length && str[i] == '(' && str[i + 1] == ')')
                sb.append('o')
        }

        return sb.toString()
    }
}