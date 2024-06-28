package com.example.medicalsystem.pojo;


import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


/**
 * 定义一个ResultVo类，用于封装响应数据
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 5085403015235441808L;
    private Integer code;
    private String msg;
    private T data;
    private Long timestamp = System.currentTimeMillis();

    /**
     * 返回成功响应数据
     * @return ResultVo<Void>
     */
    public static ResultVo<Void> success() {
        ResultVo<Void> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = ResultEnum.SUCCESS.getMessage();
        return ResultVO;
    }

    /**
     * 返回成功响应数据，包含数据
     * @param data 返回的数据
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> success(T data) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = ResultEnum.SUCCESS.getMessage();
        ResultVO.data = data;
        return ResultVO;
    }

    /**
     * 返回成功响应数据，包含自定义消息
     * @param msg 自定义消息
     * @return ResultVo<Void>
     */
    public static ResultVo<Void> successMsg(String msg) {
        ResultVo<Void> ResultVO = new ResultVo<>();
        ResultVO.code = ResultEnum.SUCCESS.getCode();
        ResultVO.msg = msg;
        return ResultVO;
    }

    /**
     * 返回失败响应数据
     * @param resultEnum 枚举类
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> fail(ResultEnum resultEnum) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = resultEnum.getCode();
        ResultVO.msg = resultEnum.getMessage();
        return ResultVO;
    }

    /**
     * 返回失败响应数据，包含自定义消息
     * @param resultEnum 枚举类
     * @param msg 自定义消息
     * @return ResultVo<T>
     */
    public static <T> ResultVo<T> fail(ResultEnum resultEnum, String msg) {
        ResultVo<T> ResultVO = new ResultVo<>();
        ResultVO.code = resultEnum.getCode();
        ResultVO.msg = msg;
        return ResultVO;
    }
}
