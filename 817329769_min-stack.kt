id = 817329769 
lang = kotlin 
runtime  = 401 ms 
memory = 50.3 MB
title_slug = min-stack
code =

 class MinStack() {

    var node: Node? = null
    
    fun push(x: Int) {
        if (node == null) {
            node = Node(x, x, null)
        } else {
            val nextNode = node
            node = Node(x, Math.min(nextNode?.min!!, x), nextNode)
        }
    }

    fun pop() {
        if (node != null) {
            node = node?.next
        }
    }

    fun top(): Int = node?.`val`!!
    

    fun getMin(): Int = node?.min!!
    
    
    class Node(
        val `val`: Int,
        val min: Int,
        val next: Node? = null
    )

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */