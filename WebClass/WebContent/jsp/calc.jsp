<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숫자 합 계산</title>
</head>
<body>
<form>
<input type="number" name="num" required>
<button type="submit">계산</button>
</form>
<%-- 스크립틀릿 tag로 1~입력받은 숫자까지의 합 구하기 --%>
<%-- 결과 출력 시 변수 값은 표현식 tag로 작성하기 (jsp 파일 로딩시에는 보이지 않음) --%>

<%
int sum=0;
String num = request.getParameter("num");
try{
	for(int i=0;i<=Integer.parseInt(num); i++) sum += i;
	out.println("<h1> 1 ~ " + num + "까지의 합은 "+ sum + "입니다.</h1>");
}catch(Exception e){
	
}
%>

<%
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");%>
현재 일시는 <%= sdf.format(new Date()) %>
</body>
</html>