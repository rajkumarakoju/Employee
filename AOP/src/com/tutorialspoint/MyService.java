package com.tutorialspoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyService 
{
@Before("execution(* com.tutorialspoint.SampleBean.dong(..))")
public void helloAdvice(JoinPoint point)
{
	System.out.println("After adive");
}
}
