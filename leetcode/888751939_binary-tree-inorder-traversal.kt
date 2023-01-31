id = 888751939 
lang = kotlin 
runtime  = 180 ms 
memory = 35.7 MB
title_slug = binary-tree-inorder-traversal
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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        root ?: return listOf<Int>()
        return inorderTraversal(root.left) + listOf(root.`val`) + inorderTraversal(root.right)
    }
}
