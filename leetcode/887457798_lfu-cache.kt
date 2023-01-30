id = 887457798 
lang = kotlin 
runtime  = 1241 ms 
memory = 148.2 MB
title_slug = lfu-cache
code =

 import java.util.*

/**
 * key: as stated in the problem statement
 * value: as stated in the problem statement
 * timestamp: an indicator for tracking when this item was last used
 */
class Item(val key: Int, var value: Int, var timestamp: Int) {
    var usageCount = 1
    fun incrementUsage(ts: Int) {
        usageCount++
        timestamp = ts
    }

    override fun toString(): String {
        return "(key: $key, value: $value, ts: $timestamp, count: $usageCount)"
    }
}

class ItemComparator : Comparator<Item> {
    override fun compare(o1: Item?, o2: Item?): Int {
        if (o1 == null || o2 == null) return 0
        if (o1.usageCount == o2.usageCount)
            return o1.timestamp.compareTo(o2.timestamp)
        return o1.usageCount.compareTo(o2.usageCount)
    }
}

class LFUCache(capacity: Int) {

    private val cache = TreeSet<Item>(ItemComparator())
    private val itemTracker = mutableMapOf<Int, Item>()
    private var timestamp = 0 // used to break tie
    private val cap = capacity

    fun get(key: Int): Int {
        itemTracker[key] ?: let { return -1 }
        return cache.floor(itemTracker[key])!!.also {
            cache.remove(it)
            it.incrementUsage(++timestamp)
            cache.add(it)
        }.value
    }

    fun put(key: Int, value: Int) {
        if (cap == 0) return
        itemTracker[key]?.let {
            cache.floor(it)!!.let { item ->
                cache.remove(it)
                item.value = value
                item.incrementUsage(++timestamp)
                cache.add(it)
            }
            return
        }
        // new key
        if (cache.size == cap) {
            cache.first().let {
                cache.remove(it)
                itemTracker.remove(it.key)
            }
        }
        Item(key, value, ++timestamp).also {
            itemTracker[key] = it
            cache.add(it)
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * var obj = LFUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */