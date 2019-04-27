package com.Amazon.Hard;

import java.util.*;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		next = null;
	}
}

public class MergeKSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		ListNode[] list = new ListNode[k];
		
		list[0] = new ListNode(1);
		list[0].next = new ListNode(3);
		
		list[1] = new ListNode(0);
		list[1].next = new ListNode(5);
		list[1].next.next = new ListNode(15);
		
		list[2] = new ListNode(2);
		list[2].next = new ListNode(10);
		//list[2].next.next = new ListNode(9);
		
		ListNode head = mergeKLists(list, k);
		printList(head);

	}

	public static ListNode mergeKLists(ListNode[] lists, int k) {
		ListNode head = null, last = null;
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.data - o2.data;
			}

		});

		for (int i = 0; i < k; i++)
			pq.add(lists[i]);
		while (!pq.isEmpty()) {
			ListNode top = pq.peek();
			pq.remove();

			if (top.next != null)
				pq.add(top.next);
			if (head == null) {
				head = top;
				last = top;
			} else {
				last.next = top;
				last = top;
			}

		}

		return head;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

}
