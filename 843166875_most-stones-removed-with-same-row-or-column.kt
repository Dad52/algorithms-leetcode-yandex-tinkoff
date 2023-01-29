id = 843166875 
lang = kotlin 
runtime  = 586 ms 
memory = 57 MB
title_slug = most-stones-removed-with-same-row-or-column
code =

 //NOT MINE. FOR CHALLENGE
class Solution {
    class WeightedUF(val n: Int) {
        val parent: Array<Int>
        val weight: Array<Int>
        var components: Int
        
        init {
            parent = Array(n) { i -> i }
            weight = Array(n) { i -> 1 }
            components = n
        }
        
        fun find(p: Int) : Int {
            var pMutable = p
        
            while (parent[pMutable] != pMutable) {
                pMutable = parent[pMutable]
            }
        
            return pMutable
        }
        
        fun union(p: Int, q: Int) {
            val pRoot = find(p)
            val qRoot = find(q)
               
            if (pRoot != qRoot) {
                if (weight[pRoot] < weight[qRoot]) {
                    parent[qRoot] = pRoot
                    weight[pRoot] += weight[qRoot]
                } else {
                    parent[pRoot] = qRoot
                    weight[qRoot] += weight[pRoot]
                }
                
                components--
            }
        }        
    }       
    
    fun removeStones(stones: Array<IntArray>): Int {
        val uf = WeightedUF(stones.size)
        
        for (i in 0 until stones.size) {
            for (j in i+1 until stones.size) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    uf.union(i,j)
                }
            }
        }        
        
        return stones.size - uf.components
    }
}