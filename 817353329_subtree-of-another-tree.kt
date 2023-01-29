id = 817353329 
lang = kotlin 
runtime  = 243 ms 
memory = 38.5 MB
title_slug = subtree-of-another-tree
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
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null) return false
        if(root?.`val` == subRoot?.`val` && helper(root, subRoot)) {
            return true
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }
    
    fun helper(r: TreeNode?, s: TreeNode?): Boolean {
        
        if (r == null && s == null) return true
        if (r == null || s == null) return false
        
        return r.`val` == s.`val` && helper(r.left, s.left) && helper(r.right, s.right)
    }
    
}