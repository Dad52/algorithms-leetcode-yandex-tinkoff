id = 789888902 
lang = kotlin 
runtime  = 274 ms 
memory = 39.4 MB
title_slug = generate-parentheses
code =

 class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val list = mutableListOf<String>()
        return generate(list = list, left = "", openCount = 0, closedCount = 0, n = n).toList()
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
                list = list,
                left = "$left(",
                openCount = openCount + 1,
                closedCount = closedCount,
                n = n
            )
        }
        if (closedCount < openCount) {
            generate(
                list = list,
                left = "$left)",
                openCount = openCount,
                closedCount = closedCount + 1,
                n = n
            )
        }
        return list
    }
}