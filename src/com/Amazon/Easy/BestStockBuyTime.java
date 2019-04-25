package com.Amazon.Easy;

public class BestStockBuyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
		System.out.print("Maximum profit incured is:" + getMaxProfit(arr));

	}

	public static int getMaxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			else {
				max = Math.max(max, prices[i] - min);
			}
		}
		return max;
	}
}
