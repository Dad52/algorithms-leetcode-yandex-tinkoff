id = 840831760 
lang = kotlin 
runtime  = 546 ms 
memory = 55.7 MB
title_slug = remove-all-adjacent-duplicates-in-string
code =

 class Solution {
    fun removeDuplicates(s: String): String {
        
        var sb = StringBuilder()
        val stack = Stack<Char>()
        
        s.forEach { ch ->
            if (!stack.isEmpty()) {
                if (stack.peek() == ch) {
                    stack.pop()
                } else {
                    stack.push(ch)
                }
            } else {
                stack.push(ch)
            }
        }
        
        stack.forEach() {
            sb.append(it)
        }
        
        return sb.toString()
    }
}