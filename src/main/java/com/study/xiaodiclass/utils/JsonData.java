package com.study.xiaodiclass.utils;

/**
 * @date 2023/7/12
 */


public class JsonData {

    //返回的状态码
    private int code;
    //返回的数据
    private Object data;
    //返回的信息
    private String msg;


    public JsonData() {
    }

    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    //成功返回
    public static JsonData buildSuccess(Object data){
        return new JsonData(0, data);
    }
    //失败返回  错误信息
    public static JsonData buildError(String msg){
        return new JsonData(-1,"",msg);
    }
    //错误返回   状态码
    public static  JsonData buildError(String msg,int code){
        return new JsonData(code,"",msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

