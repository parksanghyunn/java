package com.koreait.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");	//전달 받은 한글을 깨지지 않게 인코딩 설정
		
		String num = request.getParameter("num");
		String [] arNum= {};
		Calc c = new Calc();
		PrintWriter out = response.getWriter();
		int result = 0;
		String oper = "+-*/";
		char sOper =' ';
		boolean check = true;
		
		for (int i = 0; i < oper.length(); i++) {
			if(num.contains(oper.charAt(i)+"")) {
				sOper = oper.charAt(i);
			}
			
		}
		try {
			switch (sOper) {
			case '+':
				arNum = num.split("\\"+'+');
				result = c.plus(arNum);
				
				break;
			case '-':
				arNum = num.split("\\"+'-');
				result = c.minus(arNum);
				
				break;
			case '*':
				arNum = num.split("\\"+'*');
				result = c.mul(arNum);
				
				break;
			case '/':
				arNum = num.split("\\"+'/');
				result = c.div(arNum);
				
				break;

			default:
				check = false;
				out.println("<html><body><h2>사칙연산이 올바르지 않습니다.</h2></body></html>");
				break;
			}
			
			if (check) {
				out.println("<html><body><h2> 입력 : "+num+"</h2>");
				out.println("<h2> 결과 : "+result+"</h2></body></html>");
			}
		} catch (NumberFormatException e) {
			out.println("<html><body><h2>숫자를 입력하세요</h2></body></html>");
		} catch(ArithmeticException e1) {
			out.println("<html><body><h2>0으로 나눌 수 없습니다</h2></body></html>");
		}finally{
			out.println("<html><body>");
			out.println("<a href='calc'>돌아가기</a></body></html>");
			
			if(out !=null) {
				out.close();
			}
		}
		

	}

}
