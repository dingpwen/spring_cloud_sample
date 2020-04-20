package com.gome.garbage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recycle")
public class Recycle implements Serializable{
private static final long serialVersionUID = -2L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true)
	private long userId;
	private String date;
	private String rtype;
	private String weight;
	private int score;
	
	public Recycle() {
		this.userId = 0;
		this.date = "";
		this.rtype = "";
		this.weight = "";
		this.score = 0;
	}
	
	public Recycle(Long userId, String date, String rtype, String weight, int score) {
		this.userId = userId;
		this.date = date;
		this.rtype = rtype;
		this.weight = weight;
		this.score = score;
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
	
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	
	public String getRtype() {
		return this.rtype;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public String getWeight() {
		return this.weight;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
}