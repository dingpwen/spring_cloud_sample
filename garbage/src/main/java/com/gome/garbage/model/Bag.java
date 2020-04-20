package com.gome.garbage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bag")
public class Bag implements Serializable{
private static final long serialVersionUID = -3L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true)
	private long userId;
	private String date;
	private String btype;
	
	public Bag() {
		this.userId = 0;
		this.date = "";
		this.btype = "";
	}
	
	public Bag(Long userId, String date, String btype) {
		this.userId = userId;
		this.date = date;
		this.btype = btype;
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
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getUseId() {
		return this.userId;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setBtype(String btype) {
		this.btype = btype;
	}
	
	public String getBtype() {
		return this.btype;
	}
}

