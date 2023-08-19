package com.luoxi.framework.starter.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 统一异常拦截
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/15 12:44
 */
@Slf4j
@ControllerAdvice
@ConditionalOnMissingBean(UnifiedExceptionAdvice.class)
public class UnifiedExceptionAdvice {


}
