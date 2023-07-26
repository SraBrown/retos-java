package com.systelab.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
	
	private DirReduction() {
	    throw new IllegalStateException("Utility class");
	}

	public static String[] dirReduc(String[] arr) {
    	 List<String> addr = new ArrayList<>(Arrays.asList(arr));
         for (int i = 0; i + 1 < addr.size(); i++) {
           if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(addr.get(i) + addr.get(i + 1))) {
             addr.remove(i + 1);
             addr.remove(i);
             i = -1;
           }
         }
         return addr.toArray(new String[addr.size()]);
    }

}