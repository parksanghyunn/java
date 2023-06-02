package com.koreait.beans;

public class MemberVO {
	private String name;
	private String birthday;
	
	public MemberVO() {
		this.name = "이름이 없습니다.";
		this.birthday = "생일이 입력되지 않았습니다.";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}
	
	@Override
	public String toString() {
		return name+birthday;
	}
	
}
