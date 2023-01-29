id = 840118343 
lang = kotlin 
runtime  = 313 ms 
memory = 37.3 MB
title_slug = delete-node-in-a-linked-list
code =

 /**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun deleteNode(node: ListNode?) {
        node!!.`val` = node.next.`val`
        node!!.next = node.next.next
    }
}