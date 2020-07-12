package com.qf.group.utils;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> com.qf.group.utils.ResponseEntity<T> success(T data) {
        com.qf.group.utils.ResponseEntity<T> entity = new com.qf.group.utils.ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(ErrorStatus.SUCCESS.getMsg());
        entity.setStatus(ErrorStatus.SUCCESS.getStatus());
        return entity;
    }

    public static <T> com.qf.group.utils.ResponseEntity<T> success(ErrorStatus status, T data) {
        com.qf.group.utils.ResponseEntity<T> entity = new com.qf.group.utils.ResponseEntity<>();
        entity.setData(data);
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }

    public static <T> com.qf.group.utils.ResponseEntity<T> error() {
        com.qf.group.utils.ResponseEntity<T> entity = new com.qf.group.utils.ResponseEntity<>();
        entity.setMsg(ErrorStatus. DAO_ERROR.getMsg());
        entity.setStatus(ErrorStatus. DAO_ERROR.getStatus());
        return entity;
    }

    public static <T> com.qf.group.utils.ResponseEntity<T> error(ErrorStatus status) {
        com.qf.group.utils.ResponseEntity<T> entity = new com.qf.group.utils.ResponseEntity<>();
        entity.setMsg(status.getMsg());
        entity.setStatus(status.getStatus());
        return entity;
    }
}
