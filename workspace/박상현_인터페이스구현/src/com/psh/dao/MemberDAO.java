package com.psh.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.psh.mybatis.config.SqlMapConfig;
import com.psh.vo.MemberVO;

public class MemberDAO {
	SqlSessionFactory  sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public MemberDAO() {
		sqlsession = sqlsession_f.openSession(true);
	}
	
	//아이디 중복여부 판단
	public boolean check(String email) {
		
		int result = sqlsession.selectOne("Member.check",email);
		//이미 email이 있을 경우 1 없으면 0 반환한다.
		if(result == 0) {
			return true;
		}
		return false;
	}
	
	//회원가입
	public boolean join(MemberVO vo) {
		String hobby_name = "";
		HashMap<String, String> map = new HashMap<>();
		map.put("email", vo.getEmail());
		map.put("pw", vo.getPw());
		map.put("name", vo.getName());
		
		
		HashMap<String, String> hobby = new HashMap<>();
		
		if(vo.getHobby()==null) {
			hobby_name = "취미 없음";
		}else {
			for (String data : vo.getHobby()) {
				hobby_name += data+",";
			}
			
			hobby_name.substring(0,hobby_name.length()-1);
		}
		
		hobby.put("email", vo.getEmail());
		hobby.put("hobby", hobby_name);
		
		int result = sqlsession.insert("Member.join",map);
		int h_result = sqlsession.insert("Member.hobby",hobby);
		
		//성공적으로 저장시 1반환한다.
		if (result ==1 && h_result ==1) {
			return true;
		}
		return false;
	}
	
	//로그인
	public boolean login(String email, String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("email", email);
		map.put("pw", pw);
		
		int result = sqlsession.selectOne("Member.login",map);

		//아이디와 비밀번호 모두 존재하고, 일치할 경우 count가 1이 된다.
		if(result == 1) {
			return true;
		}
		return false;
	}
	
	//비밀번호 찾기시 이메일이 있는지 확인한다.
	public boolean find(String email) {
		int result = sqlsession.selectOne("Member.find", email);
		if(result ==1) {
			return true;
		}
		
		return false;
	}
	
	//임시비밀번호를 이메일로 발송후 원래 비밀번호를 임시비밀번호로 변경해준다.
	public boolean findCh(String email,String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("email", email);
		map.put("pw", pw);
		int result = sqlsession.update("Member.findCh", map);
		
		if(result ==1) {
			return true;
		}
		
		return false;
	}
	
	
}
