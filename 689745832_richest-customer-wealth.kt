id = 689745832 
lang = kotlin 
runtime  = 322 ms 
memory = 36.2 MB
title_slug = richest-customer-wealth
code =

 class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        
        var currWealth = 0
        var maxWealth = 0

        accounts.forEach{ acc ->
            currWealth = 0
            acc.forEach { money -> 
                currWealth += money
            }
            if (currWealth > maxWealth) maxWealth = currWealth
        } 

        return maxWealth
        
    }
}