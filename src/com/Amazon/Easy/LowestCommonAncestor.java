package com.Amazon.Easy;

/**
 * 
 * @author harsh.dusane
 * 
 * We can solve this problem using BST properties.
 * We can recursively traverse the BST from root. 
 * The main idea of the solution is, 
 * while traversing from top to bottom, 
 * the first node n we encounter with value between n1 and n2, 
 * i.e., n1 < n < n2 or same as one of the n1 or n2, is LCA of n1 and n2 (assuming that n1 < n2). 
 * So just recursively traverse the BST in, 
 * if node’s value is greater than both n1 and n2 then our LCA lies in left side of the node, 
 * if it’s is smaller than both n1 and n2, then LCA lies on right side. 
 * Otherwise root is LCA (assuming that both n1 and n2 are present in BST)
 *
 */

public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode getLCA(TreeNode t,int n1,int n2) {
		if(t ==null)
			return null;
		if(t.data<n1&& t.data<n2)
			return getLCA(t.right,n1,n2);
		if(t.data>n1 && t.data>n2)
			return getLCA(t.left,n1,n2);
		
		return t;
		
	}

}
