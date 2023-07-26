package com.systelab.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest {

    @Test
    public void testGetStringWithZeros() {
	String test = StringHelper.getStringWithoutFrontZeros("%000123");
	assertEquals("1234", test);
    }
    
    @Test
    public void stringToStringArray() {
        assertTrue(Arrays.equals(new String[]{"hola","que", "tal"},  StringHelper.stringToStringArray("hola_que_tal")));
    }
    
    @Test
    public void stringArrayToString() {
        assertEquals("hola_que_tal",  StringHelper.stringArrayToString(new String[]{"hola","que", "tal"}));
    }
    
    
    @Test
    public void replaceSubString() {
    	assertEquals("Hola_QUE_tal",  StringHelper.replaceSubString("Hola_SI_tal","que","Hola_SI_tal"));
    }

}