package com.li88qq.api.config.constant;

/**
 * 统一响应编码
 *
 * @author li88qq
 * @version 1.0 2023/8/26 19:13
 */
public enum ResponseCode {
    SUCCESS(0, "操作成功"),//成功

    NO_LOGIN(1, "未登录"),//未登录
    NO_AUTH(2, "未授权"),//未授权
    PARAM(6, "参数错误"),//参数错误
    FAIL(7, "操作失败"),
    ;//操作失败

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
