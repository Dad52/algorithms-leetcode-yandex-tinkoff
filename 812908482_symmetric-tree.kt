id = 812908482 
lang = kotlin 
runtime  = 189 ms 
memory = 38.4 MB
title_slug = symmetric-tree
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
    fun isSymmetric(root: TreeNode?): Boolean {
        return root == null || helper(root.left, root.right)
    }
    
    fun helper(left: TreeNode?, right: TreeNode?): Boolean {
        
        if (left == null || right == null)
            return left == right
        
        if (left.`val` != right.`val`)
            return false
        
         return helper(left.left, right.right) && helper(left.right, right.left)
    }
}