package com.luoxi.framework.core.exception;


import com.luoxi.framework.constants.enums.base.ICodeMessage;

/**
 *  基础层异常
 *  所有基础层的异常都应该是这个异常的子类
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/13 21:29
 */

public class BasicException extends BaseException {

    private static final long serialVersionUID = -5945238155030182115L;

    public BasicException(ICodeMessage iCodeMessage, Object[] args, String message) {
        super(iCodeMessage, args, message);
    }

    public BasicException(ICodeMessage iCodeMessage, Object[] args, String message, Throwable t) {
        super(iCodeMessage, args, message, t);
    }

}
