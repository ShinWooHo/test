package com.example.finalprotest.user.dto;

import com.example.finalprotest.user.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userAddr;
    private char userGender;
    private char userEnabled;






}
