package com.li88qq.api.utils;

import com.li88qq.api.config.constant.ResponseCode;
import com.li88qq.api.dto.BaseResponse;

/**
 * 响应工具类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:55
 */
public class ResponseUtil {

    /**
     * 响应成功
     */
    public static BaseResponse ok() {
        return new BaseResponse();
    }

    /**
     * 响应成功,带数据
     */
    public static BaseResponse ok(Object data) {
        BaseResponse response = new BaseResponse();
        response.setData(data);
        return response;
    }

    /**
     * 响应成功,带信息
     */
    public static BaseResponse okMsg(String msg) {
        BaseResponse response = new BaseResponse();
        response.setMsg(msg);
        return response;
    }

    /**
     * 响应失败
     */
    public static BaseResponse error(String msg) {
        BaseResponse response = new BaseResponse();
        response.setCode(1);
        response.setMsg(msg);
        return response;
    }

    /**
     * 响应失败
     */
    public static BaseResponse error(ResponseCode responseCode) {
        BaseResponse response = new BaseResponse();
        response.setCode(responseCode.getCode());
        response.setMsg(responseCode.getMsg());
        return response;
    }

    /**
     * 响应
     */
    public static BaseResponse response(int code, String msg, Object data) {
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }
}
