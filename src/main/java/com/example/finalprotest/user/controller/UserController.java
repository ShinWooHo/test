package com.example.finalprotest.user.controller;

import com.example.finalprotest.user.dto.GetAboutRespDto;
import com.example.finalprotest.user.dto.UserDto;
import com.example.finalprotest.user.request.UserRequestDto;
import com.example.finalprotest.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/about")
    public GetAboutRespDto hello() {
        GetAboutRespDto getAboutRespDto = new GetAboutRespDto();
        getAboutRespDto.setStr("Hi");
        return getAboutRespDto;
    }

    @PostMapping("sign-up")
    public void signUp(@RequestBody UserRequestDto userRequestDto) {
        if(UserRequestDto.hasNullDateBeforeSignup(userRequestDto)) {
            throw new NullPointerException("회원 가입 시 필수 입력 사항을 모두 입력해야 합니다.");
        }

        userService.register(userRequestDto);
    }
}
