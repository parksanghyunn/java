package com.psh.vo;

public class MemberVO {
	private String email;	//이메일(아이디로 사용)
	private String pw;		//비밀번호
	private String name;	//이름
	private String [] hobby;//취미
	
	public MemberVO() {;}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return this.email +","+ this.pw;
	}
}
