package trees;

/**
 * LeetCode Problem: 226. Invert Binary Tree 
 * https://leetcode.com/problems/invert-binary-tree/
 * solved using recursion 
 * @author deyaniragenao
 *
 */
public class InvertTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        // check if root is null or if root does not have child nodes
	        // return root otherwise 
	        if(root == null || (root.left == null && root.right==null)){
	            return root;
	        }
	        
	        // swap left and right nodes if it does have children 
	        // if root's children have children, call invertTree to reach the last leaves/ child nodes    
	        TreeNode temp = invertTree(root.left);
	        root.left = invertTree(root.right); 
	        root.right = temp; 
	        
	        return root;
	    }
	}
}
