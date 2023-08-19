package com.luoxi.framework.core.enums;

import com.luoxi.framework.constants.enums.base.ICodeMessage;
import com.luoxi.framework.core.asserts.BusinessExceptionAssert;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/14 18:40
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResultCommonEnum implements ICodeMessage, BusinessExceptionAssert {

    /**
     * success code=1000
     */
    SUCCESS(2000,"success"),

    /**
     * 服务暂不可用
     */
    SERVER_ERROR(5000,"服务暂不可用"),

    /**
     * 用户已失效，请重新登录
     */
    UAC1001001(5001,"用户已失效，请重新登录"),

    /**
     * 解析header失败
     */
    UAC10011040(5002, "解析header失败"),

    /**
     * 参数校验失败
     */
    VALIDATOR_ERROR(5003, "参数错误！"),

    /**
     * 没有该权限，请重新授权
     */
    UNAUTHORIZED(5004,"没有该权限，请重新授权"),

    /**
     * Token已过期
     */
    TOKEN_EXPIRE(5005,"Token已过期"),

    /**
     * Token格式错误
     */
    TOKEN_FORMAT_ERROR(5006,"Token格式错误"),

    /**
     * Token没有被正确构造
     */
    TOKEN_CONSTRUCTOR_ERROR(5007,"Token没有被正确构造"),

    /**
     * 签名失败
     */
    SIGN_ERROR(5008,"签名失败"),

    /**
     * Token缺失
     */
    TOKEN_MISSING(5009,"Token缺失"),

    /**
     * Token错误
     */
    TOKEN_ERROR(5010,"Token错误"),

    /**
     * 反射异常
     */
    REFLECTION_ERROR(5011,"反射异常"),

    /**
     * 参数类型异常
     */
    PARAM_TYPE_ERROR(5012,"参数类型异常"),

    /**
     * bean拷贝异常
     */
    BEAN_COPY_ERROR(5013,"bean拷贝异常"),

    /**
     * 参数类型错误
     */
    MONGO_MAP_REFLECTION_EXCEPTION(5014,"MongoDB反射不支持key为非基本类型的map参数!"),

    /**
     * 封装出错
     */
    MONGO_REFLECTION_EXCEPTION(5015,"MongoUtil异常!"),

    /**
     * 封装update对象,参数类型错误
     */
    MONGO_REFLECTION_UPDATE_PARAM_EXCEPTION(5016,"更新参数类型错误!"),

    /**
     * sso not login
     */
    SSO_NOT_LOGIN(5016,"sso not login."),

    /**
     * 默认BusinessLayerException的code
     */
    DEFAULT_BUSINESS_EXCEPTION_CODE(5017,"默认BusinessLayerException的code"),

    /**
     * 不允许重复提交，请稍后再试
     */
    REPEAT_SUBMIT(5018,"不允许重复提交，请稍后再试"),
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
