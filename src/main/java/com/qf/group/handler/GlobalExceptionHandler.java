package com.qf.group.handler;

import com.google.protobuf.ServiceException;
import com.qf.group.utils.ErrorStatus;
import com.qf.group.utils.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 两个注解
 * 在类上面使用 @RestControllerAdvice
 * 在方法上面使用 ExceptionHandler
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 走异常通知
//    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(ErrorStatus errorStatus) {
        return ResponseEntity.error(ErrorStatus.SYS_ERROR);
    }

    // 走异常通知
//    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerDaoException(ErrorStatus errorStatus) {
        return ResponseEntity.error(ErrorStatus.DAO_ERROR);
    }

    // 走异常通知
    public ResponseEntity handlerServuceException(ServiceException ex) {
        return ResponseEntity.error(ErrorStatus.SERVICE_ERROR);
    }
}
