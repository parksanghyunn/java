package com.koreait.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.mybatis.config.SqlMapConfig;
import com.koreait.vo.MemberVO;

public class MemberDAO {
	SqlSessionFactory session_f = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public MemberDAO() {
		sqlsession = session_f.openSession(true); //true로 하면 자동 commit
	}
	
	//아이디 중복검사
	public boolean checkId(String id) {
		int result = sqlsession.selectOne("Member.checkId", id);
		if(result ==1) {
			return true;
		}
		return false;
	}
	
	//로그인
	public boolean login(String id, String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("pw", pw);
		int result = sqlsession.selectOne("Member.login",map);
		//아이디와 비밀번호 모두 존재하고, 일치할 경우 count가 1이 됨
		if(result ==1) {
			return true;
		}
		return false;
	}
	
	//회원 정보 저장
	public boolean join(MemberVO m_vo) {
		String hobby = "";
		HashMap<String, String> datas = new HashMap<>();
		
		datas.put("id", m_vo.getId());
		datas.put("name", m_vo.getName());
		datas.put("pw", m_vo.getPw());
		datas.put("gender", m_vo.getGender());
		datas.put("zipcode", m_vo.getZipcode());
		datas.put("address", m_vo.getAddress());
		datas.put("address_detail", m_vo.getAddress_detail());
		datas.put("address_etc", m_vo.getAddress_etc());
		
		for (String h : m_vo.getHobby()) {
			hobby += h+",";
		}
		
		hobby = hobby.substring(0, hobby.length()-1);
		datas.put("hobby", hobby);
		datas.put("hp", m_vo.getId());
		
		int result = sqlsession.insert("Member.join", datas);
		//회원가입 성공시 1반환
		if(result ==1) {
			return true;
		}
		return false;
	}
	
}
