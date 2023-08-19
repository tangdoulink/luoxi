package com.luoxi.framework.core.asserts;

import com.luoxi.framework.constants.enums.base.ICodeMessage;
import com.luoxi.framework.core.exception.BaseException;
import com.luoxi.framework.core.exception.BusinessException;

import java.text.MessageFormat;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/14 21:45
 */

public interface BusinessExceptionAssert extends ICodeMessage, Assert {

    @Override
    default BaseException baseException(Object... args) {
        String msg = MessageFormat.format(this.message(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException baseException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.message(), args);
        return new BusinessException(this, args, msg, t);
    }

}
