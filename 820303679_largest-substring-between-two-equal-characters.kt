id = 820303679 
lang = kotlin 
runtime  = 222 ms 
memory = 34.3 MB
title_slug = largest-substring-between-two-equal-characters
code =

 class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        
        val hashMap = HashMap<Char, Int>()
        var ans = -1
        
        s.forEachIndexed() { index, ch ->
            if (hashMap.containsKey(ch))
                ans = Math.max(ans, index - hashMap.getOrDefault(ch, 0) - 1)
            else
                hashMap[ch] = index
        }
        
        return ans
    }
}