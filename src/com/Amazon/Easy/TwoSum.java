package com.Amazon.Easy;

import java.util.*;
//import java.io.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,7,2,15};
		int target = 4;
		List<Integer> ans = getIndexes(arr, target);
		if(ans.isEmpty())
			System.out.println("There are no such elemensts found in the array");
		else {
			System.out.println("The indexes are :"+ans.get(0)+" "+ans.get(1));
		}
		
	}
	public static List<Integer> getIndexes(int[] arr, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map!=null && map.containsKey(target - arr[i])) {
				list.add(i);
				list.add(map.get(target-arr[i]));
				return list;
			}
		}
		return list;
	}

	
}
