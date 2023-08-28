package com.li88qq.api.dto.exception;

import com.li88qq.api.config.constant.ResponseCode;

/**
 * 响应异常类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 19:11
 */
public class ResponseException extends RuntimeException {

    private int code = 1;
    private String msg;

    public ResponseException() {
    }

    public ResponseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ResponseException(ResponseCode responseCode) {
        super(responseCode.getMsg());
        this.code = responseCode.getCode();
        this.msg = responseCode.getMsg();
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
