package com.andy.java.demo.sample.ddd.infrastructure.common;


import java.io.Serializable;

/**
 * @author li-ning
 * @date 2021-04-16
 * @param <T>
 */
public class Result<T> implements Serializable
{
    /**
     * 业务模块自定义错误码并匹配相应描述信息
     * @param code
     * @param msg
     */
    public Result(int code, String msg)
    {
        this.code = code;
        this.msg  = msg;
    }

    /**
     * 返回程序异常信息
     * @param e
     */
    public Result(Throwable e)
    {
        this.code = CommonConstant.FAULT_CODE;
        this.msg  = e.getMessage();
    }

    /**
     * 构建无需返回的请求消息
     */
    public Result()
    {
        this.code = CommonConstant.SUCCESS_CODE;
        this.msg = CommonConstant.SUCCESS_MSG;
    }

    /**
     * 通过数据对象构建结果集，消息码为0表示正
     * @param data
     */
    public Result(T data)
    {
        this.code = CommonConstant.SUCCESS_CODE;
        this.msg  = CommonConstant.SUCCESS_MSG;
        this.data = data;
    }

    /**
     * 各业务场景完全自定义消息码、描述信息和数据对象，适用于任意场景
     * @param msg
     * @param data
     */
    public Result(String msg, T data)
    {
        this.code = CommonConstant.SUCCESS_CODE;
        this.msg  = msg;
        this.data = data;
    }

    /**
     * 各业务场景完全自定义消息码、描述信息和数据对象，适用于任意场景
     * @param code
     * @param msg
     * @param data
     */
    public Result(int code, String msg, T data)
    {
        this.code = code;
        this.msg  = msg;
        this.data = data;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    private             int    code;
    private             String msg;
    private             T      data;
    public static final Long   serialVersionUID = 1L;
}
