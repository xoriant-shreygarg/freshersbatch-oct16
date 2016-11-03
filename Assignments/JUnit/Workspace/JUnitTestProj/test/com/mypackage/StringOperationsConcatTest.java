package com.mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StringOperationsConcatTest {
	
	@Before
	public void before(){
		System.out.println("Before() called");
	}
	
	@After
	public void after(){
		System.out.println("After() called");
	}

	@Test
	public void test1() {
		System.out.println("Test1() called");
		assertEquals("HelloWorld", new StringOperations().concat("Hello", "World"));
	}
	
	@Test
	public void test2() {
		System.out.println("Test2() called");
		assertEquals("Xoriant Solutions", new StringOperations().concat("Xoriant ", "Solutions"));
	}
	
	@Test
	public void test3() {
		System.out.println("Test3() called");
		assertEquals("helloworld", new StringOperations().concat("hello", "world"));
	}

}
