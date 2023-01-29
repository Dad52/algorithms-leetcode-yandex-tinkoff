id = 838098173 
lang = kotlin 
runtime  = 258 ms 
memory = 37.5 MB
title_slug = orderly-queue
code =

 //NOT MINE
class Solution {
    fun orderlyQueue(s: String, k: Int): String {
        val chars = s.toCharArray()
        if(k==1){
            var min = chars[0]
            var minPos = 0
            val posArr = mutableListOf<Int>()

            chars.forEachIndexed{
                    idx, char->
                if (char.compareTo(min)<0){
                    posArr.clear()
                    minPos = idx
                    min = char
                    posArr.add(minPos)
                }else if(char.compareTo(min)==0){
                    posArr.add(idx)
                }
            }
            var minS = s.substring(posArr[0]) + s.substring(0,posArr[0])
            posArr.forEach { 
                val temp = s.substring(it) + s.substring(0,it)
                if (temp.compareTo(minS)<0){
                    minS = temp
                }
            }
            return minS

        }else{
            chars.sort()
            return String(chars)
        }
    }
}