package com.koreait.jsons;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSON_test {
	public String json;
	public void jsonAdd() {
		//데이터를 담기 위해서 JSONObject 타입의 객체를 생성한다.
		JSONObject jObj_in = new JSONObject();
		JSONObject jObj_out = new JSONObject();
		
		//내부 요소 작성
		jObj_in.put("name", "한동석");
		jObj_in.put("gender", "man");
		jObj_in.put("nation", "korea");
		
		//외부요소 작성
		jObj_out.put("jObj_in", jObj_in);
		
		//전체 내용을 문자열 값으로 변경후 전역변수 json에 담아준다
		json = jObj_out.toJSONString();
		
		System.out.println(json);
	}
	
	public static void main(String[] args) {
		//new JSON_test().jsonAdd();
		JSON_test j_test = new JSON_test();
		
		JSONParser p = new JSONParser();
		
		j_test.jsonAdd();
		
		JSONObject json_obj = null;
		JSONObject result_obj = null;
		
		String name = null;
		String gender = null;
		String nation = null;
		
		try {
			//전체 내용(문자열)을 JSONObject타입으로 형변환(파싱)
			json_obj = (JSONObject)p.parse(j_test.json);
			//외부요소로부터 내부여소를 가지고 온다(get(k);)
			result_obj = (JSONObject)json_obj.get("jObj_in");
			
			//내부 요소로부터 값을 가져온다
			name = (String)result_obj.get("name");
			gender = (String)result_obj.get("gender");
			nation = (String)result_obj.get("nation");
			
			System.out.println("이름  : "+name);
			System.out.println("성별  : "+gender);
			System.out.println("국적  : "+nation);
		} catch (ParseException e) {
			System.out.println(e);
			System.out.println("json_obj 파싱오류");
		}
		
	}
}
