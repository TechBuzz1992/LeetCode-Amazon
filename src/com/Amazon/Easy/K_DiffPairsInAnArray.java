package com.Amazon.Easy;

/**
 * Algorithm:
 * 
 * 1) Initialize count as 0. 
 * 2) Insert all distinct elements of arr[] in a hash map. 
 *    While inserting, ignore an element if already present in the hash map.
 * 3) Do following for each element arr[i]. 
 *   a) Look for arr[i] + k in the hash map, if found then increment count. 
 *   b) Look for arr[i] - k in the hash map, if found then increment count. 
 *   c) Remove arr[i] from hash table.
 * 
 */

import java.util.*;
import java.io.*;

public class K_DiffPairsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 1, 5, 4};
		int k = 0;
		
		System.out.println(getKDiffPairsCount(arr, k));

	}

	public static int getKDiffPairsCount(int[] arr,int k) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(map!=null && !map.containsKey(arr[i]))
				map.put(arr[i], arr[i]);
		}
		for(int i = 0;i<arr.length;i++) {
			if(map!= null && map.containsValue(arr[i]+k))
				count++;
			if(map!= null && map.containsValue(arr[i]-k))
				count++;
			if(map.containsKey(arr[i]))
			     map.remove(arr[i]);
			
		}
		return count;

	}

}
