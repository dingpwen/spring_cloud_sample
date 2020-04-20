package com.gome.garbage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gome.garbage.model.User;
import com.gome.garbage.model.UserRepository;
import com.gome.garbage.model.Token;
import com.gome.garbage.model.TokenRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TokenRepository tokenRepository;

	public User register(String number, String psw, String smsCode) {
		User  user = userRepository.findByMobileNoAndPsw(number, psw);
		if(user != null) {
			return null;
		}
		String token = "user-" + System.currentTimeMillis();
		userRepository.save(new User("", number, psw, token, "", "", 0));
		user = userRepository.findByMobileNoAndPsw(number, psw);
		tokenRepository.save(new Token(token, "", user.getId()));
		// TODO Auto-generated method stub
		return user;
	}

	public User login(String number, String psw) {
		// TODO Auto-generated method stub
		User user = userRepository.findByMobileNoAndPsw(number, psw);
		if(user != null) {
			String loginToken = "user-" + System.currentTimeMillis();
			user.setToken(loginToken);
			userRepository.save(user);
			Token token = tokenRepository.findByUserId(user.getId());
			token.setToken(loginToken);
			tokenRepository.save(token);
		}
		return user;
	}

}