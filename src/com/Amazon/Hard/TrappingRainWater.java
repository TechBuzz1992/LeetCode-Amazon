package com.Amazon.Hard;

/**
 * @author harsh.dusane
 * 
 * Algorithm:
 * 
 * An Efficient Solution is to pre-compute highest bar on left and right of every bar in O(n) time. 
 * Then use these pre-computed values to find the amount of water in every array element.
 * 
 */

import java.util.*;
import java.io.*;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(getTrappedWaterLevel(arr));

	}

	public static int getTrappedWaterLevel(int[] arr) {
		int n =arr.length;
		int[] left = new int[n];
		int[] right  =new int[n];
		
		
		left[0] = arr[0];
		right[n-1] = arr[n-1];
		
		//building left array
		for(int i =1;i<n;i++)
			left[i] = Math.max(left[i-1],arr[i]);
		
		//building right array
		for(int i=n-2;i>=0;i--)
			right[i] = Math.max(right[i+1], arr[i]);
		
		int water = 0;
		//calculating water level
		for(int i=0;i<n;i++) {
			water+=Math.min(left[i], right[i])-arr[i];
		}
		
		return water;

	}

}
