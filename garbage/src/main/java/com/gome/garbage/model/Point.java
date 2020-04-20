package com.gome.garbage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "point")
public class Point implements Serializable{
private static final long serialVersionUID = -2L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true)
	private long userId;
	private String date;
	private String way;
	private int score;
	
	public Point() {
		this.userId = 0;
		this.date = "";
		this.way = "";
		this.score = 0;
	}
	
	public Point(Long userId, String date, String way, int score) {
		this.userId = userId;
		this.date = date;
		this.way = way;
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
	
	public void setWay(String way) {
		this.way = way;
	}
	
	public String getWay() {
		return this.way;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
}