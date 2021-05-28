<%@ page import="kr.ac.jejunu.UserDao" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page import="kr.ac.jejunu.User" %><%--
  Created by IntelliJ IDEA.
  User: kim
  Date: 2021/05/28
  Time: 12:25 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("kr.ac.jejunu");
    UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
    User user = userDao.findById(4);
%>
<html>
<head>
    <title>Title</title>
</head>
<h1>
    Hello~~ <%= user.getName()%>!!!
</h1>
<body>

</body>
</html>
