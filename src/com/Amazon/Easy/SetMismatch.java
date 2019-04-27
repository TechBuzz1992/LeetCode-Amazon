package com.Amazon.Easy;

import java.util.*;
import java.io.*;
public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,4};
		List<Integer> list = getSetMismatch(arr);
		System.out.println(list.get(0)+" "+list.get(1));

	}
	
	public static List<Integer> getSetMismatch(int[] arr){
		int sum = 0;
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set!=null && set.contains(arr[i]))
				list.add(arr[i]);
			else {
				sum+=arr[i];
				set.add(arr[i]);
			}
		}
		int len = arr.length;
		int maxSum = len *(len+1) / 2;
		
		int missNumber = maxSum - sum ;
		list.add(missNumber);
		
		return list;
	}

}
