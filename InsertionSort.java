package com.avinash.sortingalgos;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {

		Random random = new Random();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
	
		System.out.print("Before ");
		printArray(numbers);
		long start = System.currentTimeMillis();
		insertionSort(numbers);
		long end = System.currentTimeMillis();
		System.out.println("Time taken for total records:" + (end-start));
		System.out.print("After ");
		printArray(numbers);

		
	}
	
	private static void insertionSort(int[] numbers) {
		int currentValue;
		for(int i=1; i<numbers.length;i++) {
			currentValue = numbers[i];
			int j= i-1;
			while(j>=0 && numbers[j] > currentValue) {
				numbers[j+1] = numbers[j];
				numbers[j] = currentValue;
				j--;
			}
			
		}
		
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
