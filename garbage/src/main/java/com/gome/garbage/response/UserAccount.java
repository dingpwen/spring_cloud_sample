package com.gome.garbage.response;

public class UserAccount extends ResponseBase{
	private Integer id;
	private String loginToken;
	private String number;
	private String password;
	
	public UserAccount(Integer id, String loginToken, String number, String password) {
		//super(200, "");
		this.id = id;
		this.loginToken = loginToken;
		this.number = number;
		this.password = password;
		
	}
	public Integer getId() {
		return id;
	}
	public String getloginToken() {
		return loginToken;
	}
	public String getNumber() {
		return number;
	}
	public String getPassword() {
		return password;
	}
}