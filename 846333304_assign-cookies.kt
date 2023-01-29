id = 846333304 
lang = kotlin 
runtime  = 559 ms 
memory = 54.8 MB
title_slug = assign-cookies
code =

 class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        
        var res = 0
        var i = g.lastIndex
        var j = s.lastIndex
        
        while (i >= 0 && j >= 0) {
            
            if (s[j] >= g[i]) {
                res++
                j--
            }
            i--
        }
        
        return res
    }
}