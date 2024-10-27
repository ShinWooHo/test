package com.example.finalprotest.user.service;

import com.example.finalprotest.user.DuplicateIdException;
import com.example.finalprotest.user.Entity.User;
import com.example.finalprotest.user.mapper.UserMapper;
import com.example.finalprotest.user.request.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void register(UserRequestDto userRequestDto) {
        if(isDuplicatedEmail(userRequestDto)) {
            throw new DuplicateIdException("중복된 이메일 입니다.");
        }

        // DTO -> Entity 변환
        User user = userRequestDto.toEntity();

        int insertCount = userMapper.register(user);

        if(insertCount != 1) {
            throw new RuntimeException("회원가입 메소드를 확인해 주세요." + user);
        }
    }



    private Boolean isDuplicatedEmail(UserRequestDto userRequestDto) {
        return userMapper.isDuplicatedEmail(userRequestDto.getUserEmail()) >= 1;
    }
}
