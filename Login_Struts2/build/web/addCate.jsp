<%-- 
    Document   : addCate
    Created on : May 14, 2020, 8:47:36 PM
    Author     : ADMIN
--%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <s:form action="addnewc" method="post">
            <s:textfield label="Cate ID" name="id"/>
            <s:textfield label="Cate Name" name="name"/>
            <s:textfield label="Description" name="des"/>
           
            <s:submit method="addActionC" value="Add Cate"/>
        </s:form>
    </body>
</html>
