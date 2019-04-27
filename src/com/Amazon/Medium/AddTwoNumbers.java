package com.Amazon.Medium;

import java.util.*;
import java.io.*;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(4);
		
		ListNode head2 = new ListNode(3);
		head2.next = new ListNode(5);
		
		ListNode head = getSum(head1, head2);
		printList(head);

	}

	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		return prev;
	}

	public static ListNode getSum(ListNode first, ListNode second) {
		ListNode res = null;
		ListNode prev = null;
		ListNode temp = null;
		int carry = 0, sum;
		while (first != null || second != null) {
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new ListNode(sum);
			if (res == null) {
				res = temp;
			} else // If this is not the first node then connect it to the rest.
			{
				prev.next = temp;
			}

			// Set prev for next insertion
			prev = temp;

			// Move first and second pointers to next nodes
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
		}
		if (carry > 0) {
			temp.next = new ListNode(carry);
		}

		// return head of the resultant list
		return res;

	}
	public static void printList(ListNode head) { 
        while (head != null) { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
        System.out.println(""); 
    }

}
