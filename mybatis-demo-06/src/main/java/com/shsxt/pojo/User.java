package com.shsxt.pojo;

public class User {
	
	private int id;
	
	private String userName;
	
	private double  userBalance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userBalance=" + userBalance + "]";
	}
	

}
