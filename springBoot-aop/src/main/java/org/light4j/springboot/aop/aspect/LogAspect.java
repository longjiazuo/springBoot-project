package org.light4j.springboot.aop.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.light4j.springboot.aop.annotation.Action;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	// pointCut
	@Pointcut("@annotation(org.light4j.springboot.aop.annotation.Action)")
	public void log() {

	}

	/**
	 * 前置通知
	 */
	@Before("log()")
	public void doBeforeController(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("action名称 " + action.value()); // ⑤
	}

	/**
	 * 后置通知
	 */
	@AfterReturning(pointcut = "log()", returning = "retValue")
	public void doAfterController(JoinPoint joinPoint, Object retValue) {
		System.out.println("retValue is:" + retValue);
	}
}
