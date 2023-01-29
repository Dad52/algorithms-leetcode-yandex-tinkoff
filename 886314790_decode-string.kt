id = 886314790 
lang = kotlin 
runtime  = 147 ms 
memory = 34.7 MB
title_slug = decode-string
code =

 class Solution {
    fun decodeString(s: String): String {
        val ns = Stack<Int>()
        val ss = Stack<String>()

        var i = 0
        while (i < s.length) {
            val curr = s[i]
            if (curr.isDigit()) {
                var end = i + 1
                while (s[end].isDigit()) 
                    end++
                ns.push(s.substring(i, end).toInt())
                i = end
            } else if (curr == ']') {
                var temp = ""
                while (ss.peek() != "[") 
                    temp = ss.pop() + temp
                ss.pop()
                var temp2 = ""
                repeat(ns.pop()) {
                    temp2 += temp
                }
                ss.push(temp2)
                i++
            } else {
                ss.push(curr.toString())
                i++
            }
        }
        var ans = ""
        while (!ss.isEmpty()) 
            ans = "${ss.pop()}$ans"

        return ans
    }
}