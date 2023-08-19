package com.luoxi.framework.constants.enums;

import com.luoxi.framework.constants.enums.base.EnumItemAble;
import com.luoxi.framework.constants.enums.base.ICodeMessage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 删除标记枚举
 *
 * @author zengfangfang
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum DeleteEnums implements ICodeMessage {

    /**
     * 删除
     */
    DELETE(1,"YES"),

    /**
     * 不删除
     */
    UN_DELETE(2,"NO"),

    ;

    private final Integer code;

    private final String message;

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

}
