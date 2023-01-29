id = 840034962 
lang = kotlin 
runtime  = 1101 ms 
memory = 113.8 MB
title_slug = online-stock-span
code =

 class StockSpanner() {

    val spans = arrayListOf<Pair<Int, Int>>()
    
    fun next(price: Int): Int {
        var id = spans.lastIndex
        while (id > -1 && spans[id].first <= price) {
            id -= spans[id].second
        }
        val currSpan = spans.size - id
        spans.add(Pair(price, currSpan))
        return currSpan
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */