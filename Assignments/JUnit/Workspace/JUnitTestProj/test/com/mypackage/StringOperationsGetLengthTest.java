package com.mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StringOperationsGetLengthTest {
	
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
		assertEquals(5, new StringOperations().getLength("hello"));
	}
	
	@Test
	public void test2() {
		System.out.println("Test2() called");
		assertEquals(7, new StringOperations().getLength("xoriant"));
	}
	
	@Test
	public void test3() {
		System.out.println("Test3() called");
		assertEquals(2, new StringOperations().getLength("hi"));
	}
}
