id = 894174655 
lang = kotlin 
runtime  = 138 ms 
memory = 33.7 MB
title_slug = valid-parentheses
code =

 class Solution {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()

        s.forEach() { ch ->
            if (isOpen(ch))
                st.push(ch)

            if (isClosed(ch)) {
                if (!st.isEmpty() && isCompare(st.peek(), ch)) {
                    st.pop()
                } else {
                    return false
                }
            }
        }

        return st.empty()

    }

    fun isOpen(br: Char): Boolean = br == '(' || br == '{' || br == '['
    
    fun isClosed(br: Char): Boolean = br == ')' || br == '}' || br == ']'

    fun isCompare(brOpen: Char, brClosed: Char): Boolean =  (brOpen == '[' && brClosed == ']') || 
                                                            (brOpen == '(' && brClosed == ')') || 
                                                            (brOpen == '{' && brClosed == '}')
    
}