package com.Amazon.Hard;

import java.util.*;
import java.io.*;

class TreeNode{
	int data;
	TreeNode right;
	TreeNode left;
	TreeNode(int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
}
public class SerializeAndDeserializeBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(0);
		head.right = new TreeNode(2);
		ArrayList<Integer> array = new ArrayList<Integer>();
		serializeBT(head, array);
		for(int i=0;i<array.size();i++)
			System.out.print(array.get(i)+" ");
		TreeNode root = deserializeBT(array, 0);
		System.out.print("\n" + root.data+" "+root.left.data+" "+root.right.data);

	}
	
	public static void serializeBT(TreeNode root,ArrayList<Integer> array) {
		if(root == null) {
			array.add(-1);
			return;
		}
		array.add(root.data);
		serializeBT(root.left, array);
		serializeBT(root.right, array);
	}
	
	public static TreeNode deserializeBT(ArrayList<Integer> array,int index) {
		if(index == array.size() || array.get(index) == -1) {
			index++;
			return null;
		}
			
		TreeNode root = new TreeNode(array.get(index));
		index++;
		root.left = deserializeBT(array, index);
		root.right = deserializeBT(array, index);
		
		return root;
	}

}
