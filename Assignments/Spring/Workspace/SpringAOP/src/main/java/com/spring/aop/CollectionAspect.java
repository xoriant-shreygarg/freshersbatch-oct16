package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CollectionAspect {

	@Pointcut("execution(* com.spring.aop.CollectionOpr.*(..))")
	public void pointcut1() {
	}
	
	@Around("pointcut1()")
	public Object checkParameters(ProceedingJoinPoint point) throws Throwable{
		long time1 = System.currentTimeMillis();
		Object result = point.proceed();
		System.out.println("Time taken by "+point.getSignature()+": "+(System.currentTimeMillis()-time1));
		return result;
	}

}
