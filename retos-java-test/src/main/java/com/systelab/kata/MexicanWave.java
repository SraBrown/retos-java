package com.systelab.kata;

public class MexicanWave {
	private MexicanWave() {
	    throw new IllegalStateException("Utility class");
	}

    public static String[] wave(String str) {
    	if(str.length() == 0) {
            return new String[0];
        }

        int spaces = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                spaces++;
            }
        }

        String[] result = new String[str.length() - spaces];
        String temp;
        int index = 0;

        for(int i = 0; i < result.length; i++) {
            temp = "";
            for(int j = 0; j < str.length(); j++) {
                if(j == index && str.charAt(j) != ' ') {
                    temp += Character.toString(str.charAt(j)).toUpperCase();
                } else if (j == index && str.charAt(j) == ' ') {
                    temp += Character.toString(str.charAt(j));
                    index++;
                } else {
                    temp += Character.toString(str.charAt(j));
                }
            }
            result[i] = temp;
            index++;
        }

        return result;
    }

}