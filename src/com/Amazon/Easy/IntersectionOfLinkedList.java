package com.Amazon.Easy;

import java.util.*;
import java.io.*;

public class IntersectionOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		
		ListNode list2 = new ListNode(3);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(2);
		
		ListNode inter = getIntersection(list1, list2);
		ListNode tra = inter;
		if(tra==null)
			System.out.print("There are no nodes in one of the list...");
		while(tra!=null) {
			System.out.print(tra.data+" ");
			tra = tra.next;
		}

	}
	
	public static ListNode getIntersection(ListNode list1, ListNode list2) {
		if(list1 == null || list2 == null)
			return null;
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode inter = null;
		ListNode curr = inter;
		ListNode tra = list1;
		while(tra!=null) {
			set.add(tra.data);
			tra = tra.next;
		}
		
		ListNode tra1 = list2;
		while(tra1!=null) {
			if(set.contains(tra1.data)) {
				if(inter == null) {
					inter = new ListNode(tra1.data);
					curr = inter;
				}
				     
				else {
					curr.next = new ListNode(tra1.data);
					curr = curr.next;
				}
			}
			tra1 = tra1.next;
		}
		
		return inter;
	}

}
