package com.ycl.service;

import com.ycl.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
