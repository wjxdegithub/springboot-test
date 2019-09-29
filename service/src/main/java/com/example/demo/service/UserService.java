package com.example.demo.service;

import com.example.demo.mybatis.bean.Users;
import com.example.demo.mybatis.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjx
 * @create 2019-08-16 17:31
 **/
@Service
public class UserService {
    @Autowired(required = true)
    private UsersDao usersDao;

    public List<Users> queryAll(){
        List<Users> usersList = usersDao.query();
        return usersList;
    }

    public int update(Users users){
        return usersDao.updateByPrimaryKeySelective(users);
    }
}
