package com.systelab.kata;

import java.util.ArrayList;

public class EvenNumbers {
	
	private EvenNumbers() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static int[] divisibleBy(int[] numbers, int divider) {
	ArrayList<Integer> numbersOK=new ArrayList<>();
		for (int i : numbers) {
			if(i % divider == 0) { 
				numbersOK.add(i);
			}
		}
		return numbersOK.stream().mapToInt(i -> i).toArray();
	}
}
