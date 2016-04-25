package com.bean;

import java.io.Serializable;

public class UserBean implements Serializable{

	private static final long serialVersionUID = 4470957532343724696L;

	private String userName;
	
	private String pwd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public UserBean(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	
}
