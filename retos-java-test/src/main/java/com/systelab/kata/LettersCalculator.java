package com.systelab.kata;

import java.util.Arrays;

public class LettersCalculator {
    
	
	private LettersCalculator() {
		    throw new IllegalStateException("Utility class");
	}
	
	public static String addLetters(String... letters) {
      
		int sum = Arrays.stream(letters)
                .map(String::toUpperCase)
                .mapToInt(s -> s.charAt(0) - 'a' + 1)
                .sum();

        int alphabetSize = 26;
        sum = (sum - 1) % alphabetSize + 1;
        return String.valueOf((char) ('a' + sum - 1));
    }
	
}
