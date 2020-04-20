package com.gome.garbage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token implements Serializable {
	private static final long serialVersionUID = -1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = true)
	private String userName;
	@Column(nullable = false, unique = true)
	private Long userId;
	@Column(nullable = false, unique = true)
	private String token;
	
	public Token() {
		this.token = "";
		this.userName = "";
		this.userId = 0L;
	}
	
	public Token(String token, String userName, Long userId) {
		this.token = token;
		this.userName = userName;
		this.userId = userId;
	}
	
	public static long getSerialVersionUID() {
        return serialVersionUID;
    }
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getUseId() {
		return this.userId;
	}

}