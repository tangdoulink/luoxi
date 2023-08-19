package com.luoxi.framework.core.exception;


import com.luoxi.framework.constants.enums.base.ICodeMessage;

/**
 * 业务层异常业务层异常,所有在业务层出现的异常都应该是这个异常的子类
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/13 21:15
 */
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 998794428350311081L;

    public BusinessException(ICodeMessage iCodeMessage, Object[] args, String message) {
        super(iCodeMessage, args, message);
    }

    public BusinessException(ICodeMessage iCodeMessage, Object[] args, String message, Throwable t) {
        super(iCodeMessage, args, message, t);
    }

}
