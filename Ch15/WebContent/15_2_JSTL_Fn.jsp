<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>15-2</title>
</head>
<body>
	<h3>15-2. JSTL Function 라이브러리</h3>
	
	<c:set var="str" value="Hello Korea"/>
	<p>
		문자열 길이 : ${fn:length(str)}<br/>
		문자열 자르기 : ${fn:substring(str, 6, 11)}<br/>
		문자열 교체 : ${fn:replace(str, "Korea", "Busan")}<br/>
		문자열 인덱스 : ${fn:indexOf(str, "e")}<br/>
	</p>
</body>
</html>