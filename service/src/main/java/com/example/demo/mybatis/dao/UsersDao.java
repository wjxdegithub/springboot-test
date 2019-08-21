package com.example.demo.mybatis.dao;

import com.example.demo.mybatis.bean.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao {
    int deleteByPrimaryKey(Long userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> query();
}