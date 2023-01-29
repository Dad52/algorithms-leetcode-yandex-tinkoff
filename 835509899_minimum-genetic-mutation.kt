id = 835509899 
lang = kotlin 
runtime  = 274 ms 
memory = 34.5 MB
title_slug = minimum-genetic-mutation
code =

 //NOT MINE. FOR CHALLENGE
class Solution {
    fun minMutation(start: String, end: String, bank: Array<String>): Int {
     
        val queue : Queue<Pair<String, Int>> = LinkedList()
        val visited = BooleanArray(bank.size){ false }
        
        queue.add(Pair(start, 0))
        
        while(queue.isNotEmpty()) {
            
            val gene = queue.poll()
            val mutate = gene.first
            val mutationCnt = gene.second
            
            if(mutate == end) return mutationCnt
            
            bank.forEachIndexed { i, saved ->
                
                if(!visited[i] && isOneDiff(mutate, saved)) {
                    visited[i] = true
                    queue.add(Pair(saved, mutationCnt + 1))
                }
                
            }
            
        }
           
        return -1
        
    }
    
    private fun isOneDiff(one : String, two : String) : Boolean {
        var cnt = 0
        one.forEachIndexed { i, s ->
            if(s != two[i]) cnt++
        }
        return if(cnt == 1) true else false
    }
    
}