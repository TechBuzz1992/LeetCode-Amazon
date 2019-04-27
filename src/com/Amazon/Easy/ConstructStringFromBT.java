package com.Amazon.Easy;

public class ConstructStringFromBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);
		System.out.print(tree2str(t));

	}
	public static  String tree2str(TreeNode t) {
        if(t==null)
            return "";
        if(t.left==null && t.right==null)
            return t.data+"";
        if(t.right==null)
            return t.data+"("+tree2str(t.left)+")";
        return t.data+"("+tree2str(t.left)+")("+tree2str(t.right)+")";   
    }

}
