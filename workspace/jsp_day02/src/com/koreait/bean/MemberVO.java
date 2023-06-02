package com.koreait.bean;

public class MemberVO {
	private String name;
	private String birthday;
	
	public MemberVO() {;}

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
