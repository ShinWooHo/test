package com.example.finalprotest.user.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userAddr;
    private char userGender;
    private char userEnabled;

}
