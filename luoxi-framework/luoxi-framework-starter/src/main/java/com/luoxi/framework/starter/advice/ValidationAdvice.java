package com.luoxi.framework.starter.advice;

import com.alibaba.nacos.shaded.com.google.common.base.Joiner;
import com.luoxi.framework.constants.IntConstant;
import com.luoxi.framework.constants.SpecialConstant;
import com.luoxi.framework.core.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/1 16:49
 */
@Slf4j
@RestControllerAdvice
@ConditionalOnMissingBean(ValidationAdvice.class)
public class ValidationAdvice {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public Result<String> constraintViolationException(ConstraintViolationException e) {
        String join = Joiner.on(SpecialConstant.COMMA_SPACE)
                .join(e.getConstraintViolations()
                        .stream()
                        .map(c -> {
                            String path = c.getPropertyPath().toString();
                            String field = path.substring(path.indexOf(SpecialConstant.SPOT) + IntConstant.ONE);
                            return field + SpecialConstant.COLON + c.getMessageTemplate();
                        })
                        .iterator());
        String message = SpecialConstant.LEFT_BRACKET_SPACE + join + SpecialConstant.RIGHT_BRACKET_SPACE;
        return Result.fail(Result.ERROR_CODE,message, TraceContext.traceId());

    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result<String> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        String join = Joiner.on(SpecialConstant.COMMA_SPACE)
                .join(e.getBindingResult().getFieldErrors()
                        .stream()
                        .map(f -> f.getField() + SpecialConstant.COLON + f.getDefaultMessage())
                        .iterator());
        String message = SpecialConstant.LEFT_BRACKET_SPACE + join + SpecialConstant.RIGHT_BRACKET_SPACE;
        return Result.fail(Result.PARAMS_CODE,message,TraceContext.traceId());

    }

}
