package com.example.takeaway.mapper;

import com.example.takeaway.dao.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserInfo getUserById(@Param("id") Integer id);

    void insertUser(UserInfo userInfo);
}
