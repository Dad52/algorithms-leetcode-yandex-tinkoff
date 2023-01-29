id = 815950108 
lang = kotlin 
runtime  = 344 ms 
memory = 39.2 MB
title_slug = generate-parentheses
code =

 class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val list = mutableListOf<String>()
        return generate(
            list,
            "",
            0,
            0,
            n
        ).toList()
    }
    
    fun generate(
        list: MutableList<String>,
        left: String,
        openCount: Int,
        closedCount: Int,
        n: Int
    ): List<String> {
        
        if (openCount == closedCount && openCount == n) {
            list.add(left)
        }
        
        if (openCount < n) {
            generate(
                list,
                "$left(",
                openCount + 1,
                closedCount,
                n
            )
        }
        
        if (closedCount < openCount) {
            generate(
                list,
                "$left)",
                openCount,
                closedCount + 1,
                n
            )
        }
        
        return list
    }
}