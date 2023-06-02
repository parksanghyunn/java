package com.psh.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	//작성한 config.xml 객체화 하는 클래스
	private static SqlSessionFactory sqlsession;
	
	static {
		try {
			String resource = "./com/psh/mybatis/config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlsession = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
			
		} catch (IOException ie) {
			System.out.println(ie);
			throw new RuntimeException("초기화 문제 발생, SqlMapConfig.java");
		}
		
	}
	
	public static SqlSessionFactory getSqlMapInstance() {
		return sqlsession;
	}
}
