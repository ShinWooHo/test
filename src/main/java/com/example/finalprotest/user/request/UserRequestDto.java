package com.example.finalprotest.user.request;

import com.example.finalprotest.user.Entity.User;
import com.example.finalprotest.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userAddr;
    private char userGender;
    private String userStatus;

    public static boolean hasNullDateBeforeSignup(UserRequestDto userRequestDto) {
        return userRequestDto.getUserEmail() == null || userRequestDto.getUserPassword() == null || userRequestDto.getUserName() == null;
    }

    // DTO -> Entity 변환
    public User toEntity() {
        return User.builder()
                .userEmail(this.userEmail)
                .userPassword(this.userPassword)
                .userName(this.userName)
                .userPhone(this.userPhone)
                .userAddr(this.userAddr)
                .userGender(this.userGender)
                .build();
    }

    // Entity -> DTO 변환
    public static UserDto fromUser(User user) {
        return UserDto.builder()
                .userEmail(user.getUserEmail())
                .userPassword(user.getUserPassword())
                .userName(user.getUserName())
                .userPhone(user.getUserPhone())
                .userAddr(user.getUserAddr())
                .userGender(user.getUserGender())
                .build();
    }

}
