package com.example.finalprotest.user.mapper;

import com.example.finalprotest.user.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int isDuplicatedEmail(@Param("userEmail") String userEmail);

    int register(User user);

}
