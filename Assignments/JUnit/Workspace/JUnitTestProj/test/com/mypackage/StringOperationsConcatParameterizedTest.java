package com.mypackage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOperationsConcatParameterizedTest {
	
	@Parameter(value=0)
	public String s1;
	
	@Parameter(value=1)
	public String s2;

	@Parameters
	public static Collection<Object []> data(){
		Object s[][] = {{"s","h"},{"shrey","garg"},{"hello","world"},{"xor","iant"}};
		return Arrays.asList(s);
	}
	
	@Test
	public void test1() {
		System.out.println("Test1() called");
		assertEquals(s1+s2, new StringOperations().concat(s1, s2));
	}
	
}