package com.stackroute.model;

public class User {

	private Integer userNO;
	private String userCity;
	private String userName;

	public User() {
	}

	public User(Integer userNO, String userCity, String userName) {
		this.userNO = userNO;
		this.userCity = userCity;
		this.userName = userName;
	}

	public Integer getUserNO() {
		return userNO;
	}

	public void setUserNO(Integer userNO) {
		this.userNO = userNO;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
