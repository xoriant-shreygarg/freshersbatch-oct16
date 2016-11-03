package com.mypackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	StringOperationsConcatTest.class,
	StringOperationsConcatParameterizedTest.class,
	StringOperationsGetCharacterTest.class,
	StringOperationsGetCharacterParameterizedTest.class,
	StringOperationsGetLengthTest.class,
	StringOperationsGetLengthParameterizedTest.class
})
public class AllTests {

}
