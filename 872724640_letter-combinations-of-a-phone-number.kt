id = 872724640 
lang = kotlin 
runtime  = 290 ms 
memory = 35.3 MB
title_slug = letter-combinations-of-a-phone-number
code =

 class Solution {

    private val pad = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")

    fun letterCombinations(digits: String): List<String> {
        
        val list = ArrayList<String>()
        if (digits.isEmpty()) return list

        val sb = StringBuilder()
        dfs(0, digits, sb, list)

        return list
    }

    fun dfs(i: Int, digits: String, sb: StringBuilder, list: ArrayList<String>) {
        
        if (i == digits.length) {
            list.add(sb.toString())
            return
        }

        val temp = pad[digits[i] - '0']

        for (ch in temp) {
            sb.append(ch)
            dfs(i + 1, digits, sb, list)
            sb.deleteCharAt(sb.length - 1)
        }

    }
}