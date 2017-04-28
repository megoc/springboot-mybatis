package com.flymegoc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by flymegoc on 2017/4/28.
 */
@Aspect
@Component
public class PictureAspect extends HttpAspect{


    Logger logger= LoggerFactory.getLogger(PictureAspect.class);

    @Pointcut("execution(public * com.flymegoc.controller.PictureController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void logBefort(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest=servletRequestAttributes.getRequest();
        logger(httpServletRequest,joinPoint);

    }

    @After("log()")
    public void logAfter(){
        logger.info("after");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void alterReturnnig(Object object){
        logger.info("response={}",object.toString());
    }
}
