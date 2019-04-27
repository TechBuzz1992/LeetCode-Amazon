package com.Amazon.Easy;

import java.util.*;
import java.io.*;
public class ConvertBST {

	public static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left = new TreeNode(1);
		
		root = convertBST(root);
		
		System.out.print(root.left.data+" ");
		System.out.print(root.data+" ");
		System.out.print(root.right.data+" ");
	}
	
	public static TreeNode convertBST(TreeNode root) {
		if(root!=null) {
			convertBST(root.right);
			sum+=root.data;
			root.data = sum;
			convertBST(root.left);
		}
		return root;
	}

}
