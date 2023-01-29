id = 704893908 
lang = kotlin 
runtime  = 146 ms 
memory = 33.8 MB
title_slug = valid-parentheses
code =

 class Solution {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()

        s.forEach {
            if (isOpen(it)) {
                st.push(it)
            } else {
                if (!st.empty() && isPair(st.peek(), it)) {
                    st.pop()
                } else {
                    return false
                }
            }
        }
        return st.empty()
    }
    
    fun isPair(peek: Char, it: Char): Boolean {
        return (peek == '(' && it == ')') || (peek == '{' && it == '}') || (peek == '[' && it == ']')
    }

    fun isOpen(it: Char): Boolean {
        return it == '(' || it == '{' || it == '['
    }
}