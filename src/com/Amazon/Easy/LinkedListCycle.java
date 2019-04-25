package com.Amazon.Easy;

import java.util.*;
import java.io.*;
public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		System.out.println(hasCycle(head));

	}
	
	public static boolean hasCycle(ListNode head) {
		HashSet<Integer> visited = new HashSet<Integer>();
		while(head!=null) {
			if(visited.contains(head.data))
				return true;
			else {
				visited.add(head.data);
				head = head.next;
			}
		}
		return false;
	}

}
