package com.Amazon.Easy;

class TreeNode {
	int data;
	TreeNode right;
	TreeNode left;

	TreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;

	}
}

public class MergeBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		
		TreeNode t2 = new TreeNode(2);
		t2.right = new TreeNode(4);
		
		t1 = mergeTrees(t1, t2);
		
		System.out.println("Root node is:"+t1.data);
		
		

	}
	
	public static TreeNode mergeTrees(TreeNode t1,TreeNode t2) {
		if(t1 == null)
			return t2;
		if(t2 == null)
			return t1;
		t1.data+=t2.data;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		
		return t1;
	}

}
