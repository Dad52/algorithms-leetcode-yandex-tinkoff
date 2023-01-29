id = 875524135 
lang = kotlin 
runtime  = 152 ms 
memory = 33.5 MB
title_slug = same-tree
code =

 /**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return helper(p, q)
    }
    fun helper(left: TreeNode?, right: TreeNode?): Boolean {
        
        if (left == null || right == null)
            return left == right
        
        if (left.`val` != right.`val`)
            return false
        
        return helper(left.left, right.left) && helper(left.right, right.right)
    }
}