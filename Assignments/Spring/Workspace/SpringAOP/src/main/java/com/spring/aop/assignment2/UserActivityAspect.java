package com.spring.aop.assignment2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class UserActivityAspect {

	@Around("execution(* com.spring.aop.assignment2.UserHandler.login(..))")
	public Object checkParameters(ProceedingJoinPoint point) throws Throwable {
		Object result = null;
		if (((String) point.getArgs()[0]).length() < 3)
			throw new MyException("Username length < 3!");
		result = point.proceed();
		return result;
	}

	@Around("execution(* com.spring.aop.assignment2.UserHandler.logout(..))")
	public Object checkLogout(ProceedingJoinPoint point) throws Throwable {
		Object result = null;
		if (UserHandler.isUserLoggedIn)
			result = point.proceed();
		else
			throw new MyException("No user logged in!");
		return result;
	}

	@Around("execution(* com.spring.aop.assignment2.UserHandler.register(..))")
	public Object checkRegister(ProceedingJoinPoint point) throws Throwable {
		Object result = null;
		if (((String) point.getArgs()[0]).length() < 3||((String) point.getArgs()[1]).length() < 3)
			throw new MyException("Username or password length < 3!");
		result = point.proceed();
		return result;
	}

}