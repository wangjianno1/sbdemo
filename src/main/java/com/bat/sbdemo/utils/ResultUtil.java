package com.bat.sbdemo.utils;

public class ResultUtil {

    public static <T> ResultBody<T> success(T data) {
        ResultBody<T> resultBody = new ResultBody<T>();
        resultBody.setRetcode(ResultCode.SUCCESS.getRetCode());
        resultBody.setMessage(ResultCode.SUCCESS.getMessage());
        resultBody.setData(data);
        return resultBody;
    }

    public static ResultBody<Object> exception(String message) {
        ResultBody<Object> resultBody = new ResultBody<Object>();
        resultBody.setRetcode(ResultCode.EXCEPTION.getRetCode());
        resultBody.setMessage(message);
        resultBody.setData(null);
        return resultBody;
    }

    public static ResultBody<Object> error() {
        ResultBody<Object> resultBody = new ResultBody<Object>();
        resultBody.setRetcode(ResultCode.ERROR.getRetCode());
        resultBody.setMessage(ResultCode.ERROR.getMessage());
        resultBody.setData(null);
        return resultBody;
    }
}
