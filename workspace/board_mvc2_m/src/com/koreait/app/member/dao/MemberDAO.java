package com.koreait.app.member.dao;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.member.vo.MemberVO;
import com.koreait.mybatis.config.SqlMapConfig;

public class MemberDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public MemberDAO() {
		sqlsession = sessionf.openSession(true);
	}
	
	public boolean join(MemberVO member) {
		if(sqlsession.insert("Member.join",member)==1) {
			return true;
		}
		return false;
	}
	
	public boolean checkId(String member_id) {
		int cnt = sqlsession.selectOne("Member.checkId", member_id);
		if(cnt == 1) {
			return true;
		}
		return false;
	}
	
	public String login(String member_id, String member_pw) {
		System.out.println(member_id);
		System.out.println(member_pw);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("member_id", member_id);
		map.put("member_pw", member_pw);
		
		return sqlsession.selectOne("Member.login",map);
	}
}
