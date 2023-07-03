package com.fckey.ttyx.common.exception;

import com.fckey.ttyx.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @program: ttyx
 * @classname GlobalExceptionHandler
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/07/03 10:37
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    // 全局异常处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail(null);
    }

    // 自定义异常处理
    @ExceptionHandler(TtyxException.class)
    @ResponseBody
    public Result error(TtyxException e){
        return Result.build(null, e.getCode(), e.getMessage());
    }
}