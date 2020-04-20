package com.gome.garbage.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 3537921742065870581L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(nullable = true)
	private String name;
	@Column(nullable = false)
	private String psw;
	@Column(nullable = false, unique = true)
	private String token;
	@Column(nullable = false, unique = true)
	private String mobileNo;
	@Column(nullable = true)
	private String ra;
	@Column(nullable = true)
	private String address;
	@Column
	private int identity;
	
	public User() {
		this.name = "";
		this.mobileNo = "";
		this.psw = "";
		this.token = "";
		this.ra = "";
		this.address = "";
		this.identity = 0;
	}
	
	public User(String name, String mobileNo, String psw, String token, String ra, String address, int identity) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.psw = psw;
		this.token = token;
		this.ra = ra;
		this.address = address;
		this.identity = identity;
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	public String getPsw() {
		return this.psw;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	
	public int getIdentity() {
		return this.identity;
	}
}