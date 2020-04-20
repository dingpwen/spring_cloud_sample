package com.gome.garbage.response;

public class LoginResult extends ResponseBase {
	private String loginToken;
	
	public LoginResult(String loginToken) {
		//super(200, "");
		this.loginToken = loginToken;	
	}
	
	public LoginResult(String loginToken, int status, String msg) {
		super(status, msg);
		this.loginToken = loginToken;	
	}

	public String getloginToken() {
		return loginToken;
	}
}