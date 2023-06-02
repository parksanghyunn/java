package com.koreait.app.member.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.member.vo.MemberVO;
import com.koreait.mybatis.config.SqlMapConfig;

//mybatis를 통해 .xml파일의 쿼리문을 사용한다(JAVA코드와 SQL문이 분리되어 있어서 가독성이 좋다)
//쿼리문을 실행할 때 필요한 데이터를 매개변수 등으로 전달 받고
//실행한 결과를 리턴해주는 메소드가 모여있다.
//컨트롤러에서 선언하지 않고 DAO에 따로 분리하여 선언해 놓는다.
public class MemberDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession sqlsession;
	
	public MemberDAO() {
		sqlsession = sessionf.openSession(true);
	}
	
	//회원가입
	public boolean join(MemberVO member) {
		//외부에서 사용자가 입력한 정보를 DB에 저장한다.
		if(sqlsession.insert("Member.join", member) == 1) {
			return true;
		}
		return false;
	}
	
	//아이디 중복검사
	public boolean checkId(String id) {
		//아이디를 DB에서 조회한 후 검색된 결과 개수를 가져온다.
		if((Integer)sqlsession.selectOne("Member.checkid", id) == 1) {
			//중복이 있을 때
			return true;
		}
		//중복이 없을 때
		return false;
	}
	
	//로그인
	public String login(String id, String pw) {
		HashMap<String, String> dataMap = new HashMap<>();
		dataMap.put("member_id", id);
		dataMap.put("member_pw", pw);
		//DB 조회 시 아이디와 비밀번호가 일치하면 해당 아이디를 리턴해준다(세션을 사용하기 위함)
		return (String)sqlsession.selectOne("Member.login", dataMap);
	}
}







