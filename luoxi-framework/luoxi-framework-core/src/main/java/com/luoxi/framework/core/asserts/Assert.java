package com.luoxi.framework.core.asserts;


import com.luoxi.framework.core.exception.BaseException;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/13 21:15
 */

public interface Assert {

    /**
     * 基础服务类异常
     * @param args args
     * @return BasicException
     */
    BaseException baseException(Object... args);

    /**
     * 创建异常
     * @param args args
     * @return BusinessException
     */
    BaseException baseException(Throwable t,Object... args);

    /**
     * 断言对象obj非空,如果对象obj为空，则抛出异常
     *
     * @param obj 待判断对象
     */
    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw baseException(obj);
        }
    }

    /**
     * 断言对象obj非空。如果对象obj为空，则抛出异常
     * 异常信息message支持传递参数方式，避免在判断之前进行字符串拼接操作
     * @param obj 待判断对象
     * @param args message占位符对应的参数列表
     */
    default void assertNotNull(Object obj, Object... args) {
        if (obj == null) {
            throw baseException(args);
        }
    }

}
