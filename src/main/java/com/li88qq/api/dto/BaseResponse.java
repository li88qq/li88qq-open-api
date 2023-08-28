package com.li88qq.api.dto;

/**
 * 基本响应类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:19
 */
public class BaseResponse {

    //状态,0-成功
    private int code;
    //响应信息
    private String msg;
    //响应数据
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
