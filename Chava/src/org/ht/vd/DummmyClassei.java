package org.ht.vd;

import java.util.*;
public class DummmyClassei {
	// Remember: Binary search requires the array to be sorted
	public static int iterativeBinarySearch(int[] nums, int value) { // O(logn)
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == value) {
				return mid;
			} else if (nums[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	// Remember: Binary search requires the array to be sorted
	public static int recursiveBinarySearch(int[] nums, int low, int high, int value) { // O(logn)
		if (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == value) {
				return mid;
			} else if (nums[mid] < value) {
				return recursiveBinarySearch(nums, mid + 1, high, value);
			} else {
				return recursiveBinarySearch(nums, low, mid - 1, value);
			}
		}
		return -1;
	}

	public static void shiftElementsToTheLeft(int[] nums, int index, int nums_in_arr) {
		for (int i = index; i < nums_in_arr; i++) {
			nums[i] = nums[i + 1];
		}
	}

	public static int deleteSorted(int[] nums, int value, int nums_in_arr) { // O(n)
		for (int i = 0; i < nums_in_arr + 1; i++) {
			if (nums[i] == value) {
				shiftElementsToTheLeft(nums, i, nums_in_arr);
				return nums_in_arr;
			}
		}

		return -1;
	}

	public static int deleteSortedUsingBinarySearch(int[] nums, int value, int nums_in_arr) { // O(n)
		int index = iterativeBinarySearch(nums, value); // O(logn)

		if (index != -1) {
			shiftElementsToTheLeft(nums, index, nums_in_arr);
			return nums_in_arr;
		}

		return -1;
	}

	public static void shiftElementsToTheRight(int[] nums, int index, int nums_in_arr) {
		for (int i = nums_in_arr - 1; i > index; i--) {
			nums[i] = nums[i - 1];
		}
	}

	public static int insertSorted(int[] nums, int value, int nums_in_arr) { // O(n)
		int n = nums.length;
		if (nums_in_arr > n) {
			return -1;
		}

		for (int i = 0; i < (nums_in_arr - 1); i++) {
			if (nums[i] > value) {
				shiftElementsToTheRight(nums, i, nums_in_arr);
				nums[i] = value;
				return nums_in_arr;
			}
		}

		nums[nums_in_arr - 1] = value; // value is great element in array
		return nums_in_arr; // current number of elements in array
	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n = sc.nextInt();
		int[] arr = new int[n + 5]; // To add Max. 5 more elements for the sake of insertion Logic

		// Initialize complete array to -1
		for (int i = 0; i < n; i++) {
			arr[i] = -1;
		}

		// User Input 'n' elements
		System.out.println("Enter Input 'n' elements");
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			System.out.println("\n"+arr[i]+"  is in index of  "+i+"\n");
		}
		System.out.println("value to search");

		int search_value = sc.nextInt(); // value to search
		System.out.println("\n"+"value to insert in sorted array");
		int insert_value_sorted = sc.nextInt(); // value to insert in sorted array
		System.out.println("\n"+"value to delete using linear search");
		int delete_value = sc.nextInt(); // value to delete using linear search
		System.out.println("\n"+"value to delete using binary search");
		int delete_value_bs = sc.nextInt(); // value to delete using binary search

		// Search Operation - Sorted Array
		// Iterative Binary Seach
		int result = iterativeBinarySearch(arr, search_value);
		if (result == -1) {
			System.out.println("\n"+"Value: " + search_value + " not found");
		} else {
			System.out.println("\n"+"Value: " + search_value + " found at index " + result);
		}

		// Recursive Binary Search
		result = recursiveBinarySearch(arr, 0, n - 1, search_value);
		if (result == -1) {
			System.out.println("\n"+"Value: " + search_value + " not found");
		} else {
			System.out.println("\n"+"Value: " + search_value + " found at index " + result);
		}

		// Print initial Array
		System.out.print("\n"+"Initial Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Insert Operation - Sorted Array
		result = insertSorted(arr, insert_value_sorted, ++n);
		if (result == -1) {
			System.out.println("\n"+"Array does not have enought capacity");
		} else {
			System.out.print("\n"+"Insert " + "value " + insert_value_sorted + " in sorted Array: ");
			for (int i = 0; i < result; i++) {
				System.out.print("\n"+arr[i] + " ");
			}
			System.out.println();
		}

		// Delete Operation - Sorted Array
		result = deleteSorted(arr, delete_value, --n);
		if (result == -1) {
			System.out.println("\n"+"Array does not contain value: " + delete_value);
		} else {
			System.out.print("\n"+"Deleting " + "value " + delete_value + " in Array: ");
			for (int i = 0; i < result; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		// Delete Operation - Sorted Array => Take benefit of Binary Search
		result = deleteSortedUsingBinarySearch(arr, delete_value_bs, --n);
		if (result == -1) {
			System.out.println("\n"+"Array does not contain value: " + delete_value_bs);
		} else {
			System.out.print("\n"+"Deleting " + "value " + delete_value_bs + " in Array: ");
			for (int i = 0; i < result; i++) {
				System.out.print("\n"+arr[i] + " ");
			}
			System.out.println("\n"+"\n");
		}

	}
}

// Note: We can optimize deleting element in sorted array by locating the
// element using Binary Search in O(logn)
// and deleting element and left shifting the values. Overall, Time complexity
// remains same: O(n)

// Solution: https://ideone.com/LQ7gKM
