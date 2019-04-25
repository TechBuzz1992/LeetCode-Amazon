package com.Amazon.Easy;

import java.util.*;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(1);
		
		System.out.println(isPanlindrome(head));

	}

	public static boolean isPanlindrome(ListNode head) {
		Stack<Integer> stack = new Stack<Integer>();
		ListNode tra = head;
		
		while(tra != null) {
			stack.push(tra.data);
			tra = tra.next;
		}
		
		tra = head;
		
		while(tra !=null) {
			if(tra.data != stack.peek()) 
				return false;
			else {
				stack.pop();
				tra = tra.next;
			}
				
			
				
		}
		
		return true;
	}

}
