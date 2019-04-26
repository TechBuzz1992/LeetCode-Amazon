package com.Amazon.Easy;

import java.util.*;

public class TwoSumll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {2,7,9,11};
		List<Integer> ans = getIndexes(Arrays.asList(arr), 16);
		System.out.println(ans.get(0)+" "+ans.get(1));
	}

	public static List<Integer> getIndexes(List<Integer> list, int target) {
		int low = 0;
		int high = list.size() - 1;
		int sum = 0;

		List<Integer> ans = new ArrayList<Integer>();
		/*ans.add(-1);
		ans.add(-1);*/
		while (low < high) {
			sum = list.get(low) + list.get(high);
			if (sum == target) {
				ans.add(low + 1);
				ans.add(high + 1);
				return ans;
			}
			if (sum < target)
				low++;
			if (sum > target)
				high--;

		}
		ans.add(-1);
		ans.add(-1);
		return ans;
	}

}
