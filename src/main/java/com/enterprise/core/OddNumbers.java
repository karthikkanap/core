package com.enterprise.core;

public class OddNumbers {
	public int findSum(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 != 0) {
				count = count + intArray[i];
			}
		}
		return count;
	}

	public float findAverage(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			count = count + intArray[i];
		}
		return count / intArray.length;
	}

}
