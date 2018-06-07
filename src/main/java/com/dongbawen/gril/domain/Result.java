package com.dongbawen.gril.domain;

/**
 * @author missli
 * @description TODO
 * @create date 2018/6/7 11:42
 * @modified by
 * @modify date
 * @company:云南东巴文信息技术有限公司
 */
public class Result<T> {

    //错误码
    private Integer code;

    //提示信息
    private String message;

    //具体内容
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
