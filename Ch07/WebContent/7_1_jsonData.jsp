<%@ page contentType="application/json;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String json = "{\"uid\": \"a101\", \"name\": \"홍길동\", \"hp\": \"010-1234-1111\", \"pos\": \"사원\"}"; //쌍따옴표 앞에 전부 역슬러시(\) 처리
	out.print(json);
%>