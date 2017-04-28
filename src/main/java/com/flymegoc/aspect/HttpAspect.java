package com.flymegoc.aspect;

import com.flymegoc.service.ILoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**拦截记录
 * Created by flymegoc on 2017/4/28.
 */
public abstract class HttpAspect {
    Logger logger= LoggerFactory.getLogger(HttpAspect.class);
    @Autowired
    private ILoggerService loggerService;

    //保存访问日志
    protected void logger(HttpServletRequest httpServletRequest,JoinPoint joinPoint){
        com.flymegoc.model.Logger myLogger=new com.flymegoc.model.Logger();
        String url= String.valueOf(httpServletRequest.getRequestURL());
        logger.info("url={}",url);
        String method=httpServletRequest.getMethod();
        myLogger.setUrl(url);
        logger.info("method={}",method);
        myLogger.setMethod(method);
        String ip=httpServletRequest.getRemoteAddr();
        logger.info("ip={}",ip);
        myLogger.setIpAdress(ip);
        String classMethod=joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        logger.info("classMethod={}",classMethod);
        myLogger.setCalssMethod(classMethod);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        for (Object args:joinPoint.getArgs())
        {
            stringBuilder.append(args.toString()+",");
        }
        stringBuilder.append("]");
        String args=stringBuilder.toString();
        myLogger.setArgs(args);
        logger.info("args={}",args);
        Date date=new Date();
        myLogger.setCreateTime(date);
        myLogger.setUpdateTime(date);
        loggerService.insert(myLogger);
    }
}
