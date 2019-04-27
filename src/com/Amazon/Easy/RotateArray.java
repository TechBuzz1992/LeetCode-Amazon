package com.Amazon.Easy;

/**
 * 
 * 
 * @author harsh.dusane
 * 
 *         Approach #4 Using Reverse [Accepted] Algorithm
 * 
 *         This approach is based on the fact that when we rotate the array k
 *         times, elements from the back end of the array come to the front and
 *         the rest of the elements from the front shift backwards.
 * 
 *         In this approach, we firstly reverse all the elements of the array.
 *         Then, reversing the first k elements followed by reversing the rest
 *         elements gives us the required result.
 *
 */
import java.util.*;
import java.io.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		arr = rotate(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int[] rotate(int[] arr, int k) {
		k%=arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length - 1);
		
		return arr;
				
	}
	public static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
