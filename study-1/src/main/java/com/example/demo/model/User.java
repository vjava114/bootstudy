package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class User {

	private Integer userId;
	private String userKey;
	private String createDate;
	private String updateDate;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserKey() {
		return userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userKey=" + userKey + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}

	
}
