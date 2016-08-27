package com.dxe.weasel.api.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@Aspect注解表示:申明这是一个切面类
@Aspect
@Component
public class ControllerAspect {
	private static final Logger logger = LoggerFactory
			.getLogger(ControllerAspect.class);
	@ExceptionHandler
	@Around("execution(* com.dxe.weasel.api.controller..*.*(..))")
	public Object process(ProceedingJoinPoint jp) throws Throwable {
		Object rvt = null;
		long startTime = System.currentTimeMillis();
		String methodInfo = jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName();
		String paramInfo = JSON.toJSONString(jp.getArgs());
		logger.info("{\"Controller_method_start\":{},\"params:\"{}}",
				methodInfo, paramInfo);
		rvt = jp.proceed();
		long endTime = System.currentTimeMillis();
		String returnInfo = JSON.toJSONString(rvt);
		long time = endTime - startTime;
		logger.info(
				"{\"Controller_method_end\":{},\"returnData:\"{},\"duration\":{}}",
				methodInfo, returnInfo, time);
		return rvt;
	}
}