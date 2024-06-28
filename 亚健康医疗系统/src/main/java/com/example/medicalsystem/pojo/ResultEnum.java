package com.example.medicalsystem.pojo;

import lombok.Getter;

@Getter
public enum ResultEnum {
    // 成功
    SUCCESS(200, "成功"),;
    private final Integer code;
    private final String message;

    // 构造函数
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
