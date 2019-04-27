package com.Amazon.Easy;

public class ThirdMaxNumber {
	static void thirdLargest(int arr[], int arr_size) {
		/* There should be atleast three elements */
		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

		// Initialize first, second and third Largest element
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		// Traverse array elements to find the third Largest
		for (int i = 1; i < arr_size; i++) {
			/*
			 * If current element is greater than first, then update first, second and third
			 */
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} /* If arr[i] is in between first and second */
			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} /* If arr[i] is in between second and third */
			else if (arr[i] > third) {
				third = arr[i];
			}
		}

		System.out.printf("The third Largest element is %d\n", third);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 16 };
		int n = arr.length;
		thirdLargest(arr, n);
	}
}
