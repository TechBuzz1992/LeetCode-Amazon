package com.Amazon.Easy;

class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = null;
		
		
		ListNode node = reverseList(head);
		if(node == null)
			System.out.print("There are no nodes in the List");
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while(curr!=null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		return prev;
	}

}
