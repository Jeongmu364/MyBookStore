package com.dongseo.business.user;

public interface UserService {
    void insertUser(UserVo vo);
    void updateUser(UserVo vo);
    void deleteUser(UserVo vo);
    UserVo getUser(UserVo vo);
}
