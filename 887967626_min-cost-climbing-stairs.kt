id = 887967626 
lang = kotlin 
runtime  = 189 ms 
memory = 36.6 MB
title_slug = min-cost-climbing-stairs
code =

 class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var oneStep = cost[cost.size - 2]
        var twoStep = cost[cost.size - 1]
        
        var current = 0
        
        for(indx in cost.size - 3 downTo 0){
            current = Math.min(oneStep,twoStep) + cost[indx]
            twoStep = oneStep
            oneStep = current
        }
        
        return Math.min(oneStep,twoStep)
    }
}