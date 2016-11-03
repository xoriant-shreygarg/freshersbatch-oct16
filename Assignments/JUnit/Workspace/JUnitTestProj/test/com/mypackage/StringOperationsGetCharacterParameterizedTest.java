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
public class StringOperationsGetCharacterParameterizedTest {
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public int index;

	@Parameters
	public static Collection<Object []> data(){
		Object s[][] = {{"s",0},{"shrey",1},{"hello",2},{"xor",1}};
		return Arrays.asList(s);
	}
	
	@Test
	public void test1() {
		System.out.println("Test1() called");
		assertEquals(s.charAt(index), new StringOperations().getCharacter(s, index));
	}
	
}
