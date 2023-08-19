package com.luoxi.framework.core.response;

import com.luoxi.framework.constants.enums.base.ICodeMessage;
import lombok.Data;

import java.io.Serializable;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/1 18:30
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7495753461536663749L;

    /**
     * code码
     */
    private Integer code;

    /**
     * 状态码
     */
    private String status;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 返回结果
     */
    private T data;

    public static final int ZERO = 0;
    public static final int SUCCESS_CODE = 0;
    public static final int PARAMS_CODE = 400;
    public static final int ERROR_CODE = 500;
    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_ERROR = "error";
    public static final String SUCCESS_MSG = "操作成功";
    public static final String ERROR_MSG = "失败";
    public static final String PARAMS_ERROR_MSG = "参数验证失败";

    public Result() {

    }

    /**
     * 有参构造
     * @param code code
     * @param status status
     * @param msg msg
     * @param data data
     */
    public Result(Integer code, String status, String msg, T data){
        this.code = code;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功
     * 当业务操作成功,返回响应结果有数据返回且需返回自定义code、status,msg,data时使用
     * @param code code
     * @param status status
     * @param msg  msg
     * @param data data
     * @param <T> 传入的data类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(Integer code, String status, String msg,T data){
        return new Result<>(code, status, msg, data);
    }

    /**
     * 成功
     * 当业务操作成功,无需数据返回响应结果时使用
     * @param <T> 传入的data类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(){
        return ok(SUCCESS_CODE,STATUS_SUCCESS,SUCCESS_MSG,null);
    }

    /**
     * 成功
     * 当业务操作成功,需要将数据结果返回时使用
     * @param data 传入的数据类型
     * @param <T> 传入的数据类型
     * @return Result
     */
    public static <T> Result<T> ok(T data){
        return ok(SUCCESS_CODE,STATUS_SUCCESS,SUCCESS_MSG,data);
    }

    /**
     * 成功
     * 当业务操作成功,无需数据结果返回,需要指定code、status、msg时使用
     * @param code code
     * @param status status
     * @param msg msg
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(Integer code, String status, String msg){
        return ok(code,status,msg,null);
    }

    /**
     * 成功
     * 当业务操作成功时,无需数据结果返回,需要指定code、msg时使用
     * @param code code
     * @param msg msg
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(Integer code, String msg){
        return ok(code,STATUS_SUCCESS,msg,null);
    }

    /**
     * 成功
     * 当业务操作成功时,无需数据结果返回,需要指定msg时使用
     * @param msg msg
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(String msg){
        return ok(SUCCESS_CODE,STATUS_SUCCESS,msg,null);
    }

    /**
     * 成功
     * 当业务操作成功时,,需要指定msg和数据时使用
     * @param msg msg
     * @param data data
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> ok(String msg, T data){
        return ok(SUCCESS_CODE,STATUS_SUCCESS,msg,data);
    }

    /**
     * 失败
     * 当业务操作失败时,需要指定code、status、msg、data时使用
     * @param code code
     * @param status status
     * @param msg msg
     * @param data data
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> fail(Integer code, String status, String msg, T data){
        return new Result<>(code, status,msg,data);
    }

    /**
     * 失败
     * 当业务操作失败,需要指定code、status、msg时使用
     * @param code code
     * @param status status
     * @param msg msg
     * @param <T> 传入的数据类型,默认为Object
     * @return Result
     */
    public static <T> Result<T> fail(Integer code, String status, String msg){
        return fail(code, status,msg,null);
    }

    /**
     * 失败
     * 当业务操作失败,需要指定code、msg时
     * @param code code
     * @param msg msg
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> fail(Integer code, String msg){
        return fail(code, STATUS_ERROR,msg,null);
    }

    /**
     * 失败
     * 当业务操作失败时,需要指定数据结果时使用
     * @param data data
     * @param <T> 传入的数据类型,默认Object
     * @return Result
     */
    public static <T> Result<T> fail(T data){
        return fail(ERROR_CODE, STATUS_ERROR,ERROR_MSG,data);
    }

    /**
     * 失败
     * 当业务操作失败时,需要指定返回信息时使用
     * @param msg msg
     * @param <T> 传入的数据类型, 默认为Object
     * @return Result
     */
    public static <T> Result<T> fail(String msg){
        return fail(ERROR_CODE, STATUS_ERROR,msg,null);
    }

    /**
     * 失败
     * 当业务操作失败时,需要返回失败状态时使用
     * @param <T> 传入的数据类型, 默认为Object
     * @return Result
     */
    public static <T> Result<T> fail(){
        return fail(ERROR_CODE, STATUS_ERROR,ERROR_MSG,null);
    }

    /**
     * 失败
     * 当业务操作失败,需要通过枚举返回响应结果时使用
     * @param iCodeMessage {@link ICodeMessage} 枚举父接口
     * @param <T> 传入的数据类型, 默认为Object
     * @return Result
     */
    public static <T> Result<T> fail(ICodeMessage iCodeMessage){
        return fail(iCodeMessage.code(), null, iCodeMessage.message());
    }

    /**
     * 失败
     * 当业务操作失败,需要通过枚举返回响应结果时使用
     * @param iCodeMessage {@link ICodeMessage} 枚举父接口
     * @param <T> 传入的数据类型, 默认为Object
     * @return Result
     */
    public static <T> Result<T> ok(ICodeMessage iCodeMessage){
        return ok(iCodeMessage.code(), null, iCodeMessage.message());
    }

}
