id = 812197831 
lang = kotlin 
runtime  = 286 ms 
memory = 34.5 MB
title_slug = valid-parentheses
code =

 class Solution {
    fun isValid(s: String): Boolean {
        
        val stack = Stack<Char>()
        
        s.forEach() {
            if (isOpen(it)) stack.push(it)
            
            if (isClosed(it)) {
                if (!stack.empty() && isCompare(stack.peek(), it)) {
                    stack.pop()
                } else {
                    return false
                }
            }
        }
        
        return stack.empty()
    }
    
    fun isOpen(bracket: Char): Boolean {
        return bracket == '(' || bracket == '[' || bracket == '{'
    }
    
    fun isClosed(bracket: Char): Boolean {
        return bracket == ')' || bracket == ']' || bracket == '}'
    }
    
    fun isCompare(peek: Char, it: Char): Boolean {
        return (peek == '(' && it == ')') || (peek == '{' && it == '}') || (peek == '[' && it == ']')
    }
    
}