package com.dongseo.business.user.impl;

import com.dongseo.business.user.UserService;
import com.dongseo.business.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(UserVo vo) {
        userDao.insertUser(vo);
    }

    @Override
    public void updateUser(UserVo vo) {
        userDao.updateUser(vo);
    }

    @Override
    public void deleteUser(UserVo vo) {
        userDao.deleteUser(vo);
    }

    @Override
    public UserVo getUser(UserVo vo) {
        return userDao.getUser(vo);
    }
}
