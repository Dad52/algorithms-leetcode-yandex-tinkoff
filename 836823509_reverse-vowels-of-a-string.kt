id = 836823509 
lang = kotlin 
runtime  = 469 ms 
memory = 42.4 MB
title_slug = reverse-vowels-of-a-string
code =

 class Solution {
    fun reverseVowels(s: String): String {
        val hashSet = HashSet<Char>()
        
        hashSet.add('a')
        hashSet.add('e')
        hashSet.add('i')
        hashSet.add('o')
        hashSet.add('u')
        hashSet.add('A')
        hashSet.add('E')
        hashSet.add('I')
        hashSet.add('O')
        hashSet.add('U')
        
        var left = 0
        var right = s.lastIndex
        val str = StringBuilder(s)
        
        while (left < right) {
            
            while (left < right && str[left] !in hashSet) {
                left++
            }
            
            while (left < right && str[right] !in hashSet) {
                right--
            }
            
            str[left] = str[right].also { str[right--] = str[left++] } 

        }
        
        return str.toString()
    }
}