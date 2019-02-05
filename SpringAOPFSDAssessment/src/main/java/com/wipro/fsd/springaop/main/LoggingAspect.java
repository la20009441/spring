package com.wipro.fsd.springaop.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

private static final Log l = LogFactory.getLog(LoggingAspect.class);
	
	long startTime;
	long endTime;
	DateFormat dateFormat;
	public LoggingAspect() {
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	}

	//@Pointcut("execution(get*(..))")
	@Pointcut("execution(* *get*(..))")
	public void methodlog() {
	}

	@Before("execution(* *get*(..))")
	void printEnteringMethodName(JoinPoint p) {
		startTime= System.currentTimeMillis();
		l.info(p.getSignature().getName() + " invoked at " + dateFormat.format(new Date()));
	}
	
	@After("execution(* *get*(..))")
	void printAfterMethodName(JoinPoint p) {
		endTime= System.currentTimeMillis() - startTime;
		l.info(p.getSignature().getName() + " ended at " + dateFormat.format(new Date()));
		l.info("Total time taken to execute "+p.getSignature().getName()+" method:" + endTime);
	}

}
