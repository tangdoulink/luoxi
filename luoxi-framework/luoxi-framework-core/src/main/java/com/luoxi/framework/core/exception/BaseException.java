package com.luoxi.framework.core.exception;


import com.luoxi.framework.constants.enums.base.ICodeMessage;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/14 17:31
 */
public class  BaseException extends RuntimeException {

    private static final long serialVersionUID = 7133304175151098909L;

    private final ICodeMessage iCodeMessage;

    private final Object[] args;

    public BaseException(ICodeMessage iCodeMessage, Object[] args, String message) {
        super(message);
        this.iCodeMessage = iCodeMessage;
        this.args = args;
    }

    public BaseException(ICodeMessage iCodeMessage, Object[] args, String message, Throwable t) {
        super(message,t);
        this.iCodeMessage = iCodeMessage;
        this.args = args;
    }

}
