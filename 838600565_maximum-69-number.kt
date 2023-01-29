id = 838600565 
lang = kotlin 
runtime  = 158 ms 
memory = 35.6 MB
title_slug = maximum-69-number
code =

 class Solution {
    fun maximum69Number (num: Int): Int {
        val str = num.toString().toCharArray()
        
        for (i in 0 until str.size) {
            if (str[i] == '6') {
                str[i] = '9'
                break
            }
        }
        
        return str.joinToString(separator = "").toInt()
    }
}