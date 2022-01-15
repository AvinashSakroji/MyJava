package com.avinash.sortingalgos;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {

		Random random = new Random();
		int[] numbers = new int[1000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
	
		System.out.print("Before ");
		printArray(numbers);
		long start = System.currentTimeMillis();
		quicksort(numbers, 0, numbers.length - 1);
		long end = System.currentTimeMillis();
		System.out.println("Time taken for total records:" + (end-start));
		System.out.print("After ");
		printArray(numbers);

	}

	private static void quicksort(int[] arr, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) {
			return;
		}

		int leftPointer = partition(arr, lowIndex, highIndex);

		quicksort(arr, lowIndex, leftPointer - 1);
		quicksort(arr, leftPointer + 1, highIndex);

	}

	private static int partition(int[] arr, int lowIndex, int highIndex) {
		
		int pivot = arr[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);
		return leftPointer;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	private static void swap(int[] arr, int lowindex, int highindex) {
		int temp = arr[highindex];
		arr[highindex] = arr[lowindex];
		arr[lowindex] = temp;
	}
}