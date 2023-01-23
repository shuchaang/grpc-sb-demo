package com.demo.client.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

//@Aspect
//@Component
@Slf4j
public class MDCAspect {
    private final static String TRACE_ID = "TRACE_ID";


    @Pointcut("execution(public * com.demo.client.invoke..*.*(..)) ")
    public void recordLog() {}

    @Before("recordLog()")
    public void before(JoinPoint point){
        MDC.put(TRACE_ID, UUID.randomUUID().toString());
    }

//    @AfterReturning(pointcut = "recordLog()", returning = "responseData")
//    public void after(JoinPoint point, ResponseData responseData){
//        responseData.setRequestId(MDC.get(TRACE_ID));
//        log.info(JSON.toJSONString(responseData));
//    }
}
