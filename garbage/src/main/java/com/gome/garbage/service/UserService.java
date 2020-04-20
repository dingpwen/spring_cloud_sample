package com.gome.garbage.service;

import com.gome.garbage.model.User;

public interface UserService {
	User register(String number, String psw, String smsCode);
	User login(String number, String psw);
}