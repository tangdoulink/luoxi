package com.luoxi.framework.constants.enums;


import com.luoxi.framework.constants.enums.base.ICodeMessage;
import lombok.Getter;

/**
 * http状态码枚举
 *
 * @author tangdou
 * @version 1.0
 * @Date 2023/8/19 19:55
 */
@Getter
public enum HttpStatusEnum implements ICodeMessage {

    /**
     * 请继续发送请求的剩余部分
     */
    CONTINUE(100, "Continue", "请继续发送请求的剩余部分"),

    /**
     *协议切换
     */
    SWITCHING_PROTOCOLS(101, "Switching Protocols", "协议切换"),

    /**
     * 请求将继续执行
     */
    PROCESSING(102, "Processing", "请求将继续执行"),

    /**
     * 可以预加载
     */
    CHECKPOINT(103, "Checkpoint", "可以预加载"),

    /**
     * 请求已经成功处理
     */
    OK(200, "OK", "请求已经成功处理"),

    /**
     * 请求已经成功处理，并创建了资源
     */
    CREATED(201, "Created", "请求已经成功处理，并创建了资源"),

    /**
     * 请求已经接受，等待执行
     */
    ACCEPTED(202, "Accepted", "请求已经接受，等待执行"),

    /**
     * 请求已经成功处理，但是信息不是原始的
     */
    NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information", "请求已经成功处理，但是信息不是原始的"),

    /**
     * 请求已经成功处理，没有内容需要返回
     */
    NO_CONTENT(204, "No Content", "请求已经成功处理，没有内容需要返回"),

    /**
     * 请求已经成功处理，请重置视图
     */
    RESET_CONTENT(205, "Reset Content", "请求已经成功处理，请重置视图"),

    /**
     * 部分Get请求已经成功处理
     */
    PARTIAL_CONTENT(206, "Partial Content", "部分Get请求已经成功处理"),

    /**
     * 请求已经成功处理，将返回XML消息体
     */
    MULTI_STATUS(207, "Multi-Status", "请求已经成功处理，将返回XML消息体"),

    /**
     * 请求已经成功处理，一个DAV的绑定成员被前一个请求枚举，并且没有被再一次包括
     */
    ALREADY_REPORTED(208, "Already Reported", "请求已经成功处理，一个DAV的绑定成员被前一个请求枚举，并且没有被再一次包括"),

    /**
     * 请求已经成功处理，将响应一个或者多个实例
     */
    IM_USED(226, "IM Used", "请求已经成功处理，将响应一个或者多个实例"),

    /**
     * 提供可供选择的回馈
     */
    MULTIPLE_CHOICES(300, "Multiple Choices", "提供可供选择的回馈"),

    /**
     * 请求的资源已经永久转移
     */
    MOVED_PERMANENTLY(301, "Moved Permanently", "请求的资源已经永久转移"),

    /**
     * 请重新发送请求
     */
    FOUND(302, "Found", "请重新发送请求"),

    /**
     * 请以Get方式请求另一个URI
     */
    SEE_OTHER(303, "See Other", "请以Get方式请求另一个URI"),

    /**
     * 资源未改变
     */
    NOT_MODIFIED(304, "Not Modified", "资源未改变"),

    /**
     * 请通过Location域中的代理进行访问
     */
    USE_PROXY(305, "Use Proxy", "请通过Location域中的代理进行访问"),
    // 306在新版本的规范中被弃用

    /**
     * 请求的资源临时从不同的URI响应请求
     */
    TEMPORARY_REDIRECT(307, "Temporary Redirect", "请求的资源临时从不同的URI响应请求"),

    /**
     * 请求的资源已经永久转移
     */
    RESUME_INCOMPLETE(308, "Resume Incomplete", "请求的资源已经永久转移"),

    /**
     * 请求错误，请修正请求
     */
    BAD_REQUEST(400, "Bad Request", "请求错误，请修正请求"),

    /**
     * 没有被授权或者授权已经失效
     */
    UNAUTHORIZED(401, "Unauthorized", "没有被授权或者授权已经失效"),

    /**
     * 预留状态
     */
    PAYMENT_REQUIRED(402, "Payment Required", "预留状态"),

    /**
     * 请求被理解，但是拒绝执行
     */
    FORBIDDEN(403, "Forbidden", "请求被理解，但是拒绝执行"),

    /**
     * 资源未找到
     */
    NOT_FOUND(404, "Not Found", "资源未找到"),

    /**
     * 请求方法不允许被执行
     */
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "请求方法不允许被执行"),

    /**
     * 请求的资源不满足请求者要求
     */
    NOT_ACCEPTABLE(406, "Not Acceptable", "请求的资源不满足请求者要求"),

    /**
     * 请通过代理进行身份验证
     */
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required", "请通过代理进行身份验证"),

    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "Request Timeout", "请求超时"),

    /**
     * 请求冲突
     */
    CONFLICT(409, "Conflict", "请求冲突"),

    /**
     * 请求的资源不可用
     */
    GONE(410, "Gone", "请求的资源不可用"),

    /**
     * Content-Length未定义
     */
    LENGTH_REQUIRED(411, "Length Required", "Content-Length未定义"),

    /**
     * 不满足请求的先决条件
     */
    PRECONDITION_FAILED(412, "Precondition Failed", "不满足请求的先决条件"),

    /**
     * 请求发送的实体太大
     */
    REQUEST_ENTITY_TOO_LARGE(413, "Request Entity Too Large", "请求发送的实体太大"),

    /**
     * 请求的URI超长
     */
    REQUEST_URI_TOO_LONG(414, "Request-URI Too Long", "请求的URI超长"),

    /**
     * 请求发送的实体类型不受支持
     */
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", "请求发送的实体类型不受支持"),

    /**
     * Range指定的范围与当前资源可用范围不一致
     */
    REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested range not satisfiable", "Range指定的范围与当前资源可用范围不一致"),

    /**
     * 请求头Expect中指定的预期内容无法被服务器满足
     */
    EXPECTATION_FAILED(417, "Expectation Failed", "请求头Expect中指定的预期内容无法被服务器满足"),

    /**
     * 请求格式正确，但是由于含有语义错误，无法响应
     */
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity", "请求格式正确，但是由于含有语义错误，无法响应"),

    /**
     * 当前资源被锁定
     */
    LOCKED(423, "Locked", "当前资源被锁定"),

    /**
     * 由于之前的请求发生错误，导致当前请求失败
     */
    FAILED_DEPENDENCY(424, "Failed Dependency", "由于之前的请求发生错误，导致当前请求失败"),

    /**
     * 客户端需要切换到TLS1.0
     */
    UPGRADE_REQUIRED(426, "Upgrade Required", "客户端需要切换到TLS1.0"),

    /**
     * 请求需要提供前置条件
     */
    PRECONDITION_REQUIRED(428, "Precondition Required", "请求需要提供前置条件"),

    /**
     * 请求过多
     */
    TOO_MANY_REQUESTS(429, "Too Many Requests", "请求过多"),

    /**
     * 请求头超大，拒绝请求
     */
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large", "请求头超大，拒绝请求"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "服务器内部错误"),

    /**
     * 服务器不支持当前请求的部分功能
     */
    NOT_IMPLEMENTED(501, "Not Implemented", "服务器不支持当前请求的部分功能"),

    /**
     * 响应无效
     */
    BAD_GATEWAY(502, "Bad Gateway", "响应无效"),

    /**
     * 服务器维护或者过载，拒绝服务
     */
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "服务器维护或者过载，拒绝服务"),

    /**
     * 上游服务器超时
     */
    GATEWAY_TIMEOUT(504, "Gateway Timeout", "上游服务器超时"),

    /**
     * 不支持的HTTP版本
     */
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version not supported", "不支持的HTTP版本"),

    /**
     * 服务器内部配置错误
     */
    VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates", "服务器内部配置错误"),

    /**
     * 服务器无法完成存储请求所需的内容
     */
    INSUFFICIENT_STORAGE(507, "Insufficient Storage", "服务器无法完成存储请求所需的内容"),

    /**
     * 服务器处理请求时发现死循环
     */
    LOOP_DETECTED(508, "Loop Detected", "服务器处理请求时发现死循环"),

    /**
     * 服务器达到带宽限制
     */
    BANDWIDTH_LIMIT_EXCEEDED(509, "Bandwidth Limit Exceeded", "服务器达到带宽限制"),

    /**
     * 获取资源所需的策略没有被满足
     */
    NOT_EXTENDED(510, "Not Extended", "获取资源所需的策略没有被满足"),

    /**
     * 需要进行网络授权
     */
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required", "需要进行网络授权")

    ;

    /**
     * code 码
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String us;

    /**
     * 中文描述
     */
    private final String cn;


    HttpStatusEnum(Integer code, String us, String cn) {
        this.code = code;
        this.us = us;
        this.cn = cn;
    }

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String message() {
        return us;
    }

}
