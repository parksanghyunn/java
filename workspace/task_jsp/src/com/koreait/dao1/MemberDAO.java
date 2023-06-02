package com.koreait.dao1;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.config.SqlMapConfig;
import com.koreait.vo1.MemberVO;

public class MemberDAO {
	SqlSessionFactory session_f = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public MemberDAO() {
		sqlsession = session_f.openSession(true); //true로 하면 자동 commit
	}
	
	
	public boolean login(String email, String pw) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("email", email);
		map.put("pw", pw);
		
		int result = sqlsession.selectOne("Member.login",map);
		
		if(result == 1) {
			return true;
		}
		return false;
	}
	
	public boolean join(MemberVO m_vo) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("email", m_vo.getEmail());
		map.put("pw", m_vo.getPw());
		
		int result = sqlsession.selectOne("Member.join",map);
		
		if (result == 1) {
			return true;
		}
		
		return false;
		
	}
	public boolean checkE(String email) {
		int in_result = sqlsession.insert("Member.check",email);
		
		if (in_result == 1) {
			return true;
		}
		
		return false;
		
	}
}
