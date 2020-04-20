package com.gome.gateway.response;

public class ResponseBase {
	private int status;
	private String msg;
	
	public ResponseBase(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public ResponseBase() {
		this.status = 200;
		this.msg = "ok";
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public String getMsg() {
		return this.msg;
	}
}
