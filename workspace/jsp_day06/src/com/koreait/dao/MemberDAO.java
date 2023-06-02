package com.koreait.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

import com.koreait.vo.MemberVO;

public class MemberDAO {
	Context context;
	DataSource dataSource;
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	public boolean checkId(String id) {
		boolean check = false;
		try {
			context = new InitialContext(null);
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = dataSource.getConnection();
			
			String qurey = "SELECT COUNT(*) FROM MEMBER WHERE ID =?";
			pstm = conn.prepareStatement(qurey);
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			rs.next();
			
			if(rs.getInt(1) !=0) {
				check = true;
			}
		} catch (NamingException ne) {
			System.out.println(ne);
			System.out.println("checkId(string id) 오류ne");
		} catch (SQLException sqle) {
			System.out.println(sqle);
			System.out.println("checkId(string id) 오류slqe");
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("checkId(string id) 오류e");
			
		}finally {
			try {
				if(rs !=null) {
					rs.close();
				}
				if(pstm !=null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
	            throw new RuntimeException(sqle.getMessage() + "\n checkId(String id) close 오류");
			}
		}
		return check;
	}
	
	//회원 가입
	public boolean join(MemberVO member) {
		
		boolean check = false;
		try {
			String hobby = "";
			context = new InitialContext(null);
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = dataSource.getConnection();
			
			String query = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?,?,?,?)";
			//취미는 ,를 넣어서 추가 해준다
			//예)게임,영화
			pstm = conn.prepareStatement(query);
			pstm.setString(1, member.getId());
			pstm.setString(2, member.getName());
			pstm.setString(3, member.getPw());
			pstm.setString(4, member.getGender());
			pstm.setString(5, member.getZipcode());
			pstm.setString(6, member.getAddress());
			pstm.setString(7, member.getAddress_detail());
			pstm.setString(8, member.getAddress_etc());
			pstm.setString(9, member.getHp());
			for (String data : member.getHobby()) {
				hobby += data+",";
			}
			hobby = hobby.substring(0,hobby.length()-1);
			pstm.setString(10, hobby);
			if(pstm.executeUpdate()!=0) {
				//성공일때
				check = true;
			}
			
			
		} catch (NamingException ne) {
			System.out.println(ne);
			System.out.println("join() 오류ne");
		} catch (SQLException sqle) {
			System.out.println(sqle);
			System.out.println("join() 오류slqe");
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("join() 오류e");
		}finally {
			try {
				if(rs !=null) {
					rs.close();
				}
				if(pstm !=null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
	            throw new RuntimeException(sqle.getMessage() + "\n join() close 오류");
			}
		}
		return check;
	}
	
	//로그인
	public boolean login(String id, String pw) {
		boolean check = false;
		try {
			context = new InitialContext(null);
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = dataSource.getConnection();
			
			String query = "SELECT COUNT(*) FROM MEMBER WHERE ID=? AND PW = ?";
			
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			rs = pstm.executeQuery();
			
			rs.next();
			if(rs.getInt(1) == 1) {
				check = true;
			}
		} catch (NamingException ne) {
			System.out.println(ne);
			System.out.println("login() 오류ne");
		} catch (SQLException sqle) {
			System.out.println(sqle);
			System.out.println("login() 오류slqe");
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("login() 오류e");
		}finally {
			try {
				if(rs !=null) {
					rs.close();
				}
				if(pstm !=null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
	            throw new RuntimeException(sqle.getMessage() + "\n login() close 오류");
			}
		}
		return check;
	}
}
