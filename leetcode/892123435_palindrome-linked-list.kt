id = 892123435 
lang = kotlin 
runtime  = 536 ms 
memory = 56.2 MB
title_slug = palindrome-linked-list
code =

 class Solution {
    fun isPalindrome(head: ListNode?): Boolean {

        if (head == null)
            return true

        var slow = head
        var fast = head

        while (fast?.next != null && fast?.next?.next != null) {
            slow = slow?.next
            fast = fast?.next.next
        }

        var fPart = head
        var sPart = reverseList(slow?.next)
        
        while (sPart != null) {
            if (fPart?.`val` != sPart?.`val`) return false
            fPart = fPart.next
            sPart = sPart.next
        }

        return true

    }

    fun reverseList(head: ListNode?): ListNode? {
        
        var prev: ListNode? = null
        var curr: ListNode? = head
        
        while (curr != null) {
            val temp = curr?.next
            curr?.next = prev
            prev = curr
            curr = temp
        }

        return prev 
    }
}