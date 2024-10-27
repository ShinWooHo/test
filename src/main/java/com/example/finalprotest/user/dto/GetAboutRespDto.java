package com.example.finalprotest.user.dto;

import lombok.Data;

@Data
public class GetAboutRespDto {
    private String str;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
