package com.fckey.ttyx.common.exception;

import com.fckey.ttyx.common.result.Result;
import com.fckey.ttyx.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @version 1.0
 * @program: ttyx
 * @classname TtyxException
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/03 10:44
 **/
@Data
public class TtyxException extends RuntimeException{
    // 异常状态码
    private Integer code;

    /**
     * @author Jeff Fong
     * @description 通过状态码和错误消息创建异常对象
     * @date 2023/7/3 10:47
     * @param: message
     * @param: code
     * @return
     **/
    public TtyxException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * @author Jeff Fong
     * @description 接收枚举类型对象
     * @date 2023/7/3 10:48
     * @param: resultCodeEnum
     * @return
     **/
    public TtyxException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
}