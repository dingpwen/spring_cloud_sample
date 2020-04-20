package com.gome.garbage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gome.garbage.model.User;
import com.gome.garbage.response.LoginResult;
import com.gome.garbage.service.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/auth/login", method = RequestMethod.POST)
	public LoginResult login(@RequestParam(value="mobileNo", defaultValue="") String mobileNo, 
			@RequestParam(value="pwd", defaultValue="") String pwd) {
		if(mobileNo == null || mobileNo.length() == 0 || pwd == null || pwd.length() == 0) {
			return new LoginResult("0000-0000", -1, "login Fail.");
		}
		User user = userService.login(mobileNo, pwd);
		if(user == null) {
			return new LoginResult("0000-0000", -1, "login Fail.");
		}
		return new LoginResult(user.getToken());
	}
	
	@RequestMapping(value="/auth/register", method = RequestMethod.POST)
	public LoginResult register(@RequestParam(value="mobileNo", defaultValue="") String mobileNo, 
			@RequestParam(value="pwd", defaultValue="") String pwd, @RequestParam(value="smsCode", defaultValue="") String smsCode) {
		if(mobileNo == null || mobileNo.length() == 0 || pwd == null || pwd.length() == 0) {
			return new LoginResult("0000-0000", -1, "login Fail.");
		}
		User user = userService.register(mobileNo, pwd, smsCode);
		if(user == null) {
			return new LoginResult("0000-0000", -1, "login Fail.");
		}
		return new LoginResult(user.getToken());	
	}
	
	@RequestMapping(value="/auth/foo", method = RequestMethod.GET)
	public String foo() {
		return "hello foo";
	}
}
