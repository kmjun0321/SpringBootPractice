<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        hello!!!!
        이 컨트롤러의 Name 은 ${name} 입니다.
        <br>
        <a href="testTotalPoliciesList">TEST JPA로 DB 조회하기</a>
        <br>
        <a href="getTotalPoliciesList">JPA로 DB 조회하기</a>
    </body>
</html>