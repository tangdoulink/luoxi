package com.luoxi.framework.constants.enums.base;


/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/1 18:38
 */

public interface ICodeMessage extends EnumItemAble {

    /**
     * code码
     * @return Integer
     */
    Integer code();

    /**
     * msg
     * @return String
     */
    String message();

    @Override
    default Object getKey() {
        return code();
    }

    @Override
    default Object getValue() {
        return message();
    }

}
