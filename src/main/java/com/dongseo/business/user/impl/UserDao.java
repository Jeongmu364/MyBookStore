package com.dongseo.business.user.impl;

import com.dongseo.business.user.UserVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertUser(UserVo vo) {
        mybatis.insert("UserDao.insertUser", vo);
    }

    public void updateUser(UserVo vo) {
        mybatis.update("UserDao.updateUser", vo);
    }

    public void deleteUser(UserVo vo) {
        mybatis.delete("UserDao.deleteUser", vo);
    }

    public UserVo getUser(UserVo vo) {
        return mybatis.selectOne("UserDao.getUser", vo);
    }
}
