package com.Amazon.Easy;

import java.util.*;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arr1 = {0,3,4,5,6};
        Integer[] arr2 = {1,2,7,8,9};
        List<Integer> list = addSortedArrays(Arrays.asList(arr1),Arrays.asList(arr2));
        for(int i=0;i<list.size();i++)
        	System.out.print(list.get(i)+" ");
	}

	public static List<Integer> addSortedArrays(List<Integer> list1, List<Integer> list2) {
		List<Integer> finalList = new ArrayList<Integer>();
		int i = 0, j = 0;
		while(i<list1.size() && j<list1.size()) {
			if(list1.get(i)<list2.get(j)) {
				finalList.add(list1.get(i));
				i++;
			}
			else if(list1.get(i)>list2.get(j)) {
				finalList.add(list2.get(j));
				j++;
			}
			else if(list1.get(i) == list2.get(j)) {
				finalList.add(list1.get(i));
				i++;
				j++;
			}
		}
		
		if(i == list1.size()) {
			while(j<list2.size()) {
				finalList.add(list2.get(j));
				j++;
			}
		}
		if(j == list2.size()) {
			while(i<list1.size()) {
				finalList.add(list1.get(i));
				i++;
			}
		}

		return finalList;
	}

}
