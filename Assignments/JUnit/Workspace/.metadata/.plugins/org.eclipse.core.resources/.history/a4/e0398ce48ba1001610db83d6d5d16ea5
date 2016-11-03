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
public class StringOperationsGetLengthParameterizedTest {
	
	@Parameter(value=0)
	public String s;

	@Parameters
	public static Collection<Object []> data(){
		Object s[][] = {{"s"},{"shrey"},{"hello"},{"xor"}};
		return Arrays.asList(s);
	}
	
	@Test
	public void test1() {
		System.out.println("Test1() called");
		assertEquals(s.length(), new StringOperations().getLength(s));
	}
	
}
