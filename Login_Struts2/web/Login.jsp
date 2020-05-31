<%-- 
    Document   : Login
    Created on : May 11, 2020, 10:05:21 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="Login" method="post">
            <s:textfield value="UserName" name="user"/><br/>
             <s:textfield value="PassWord" name="pass"/><br/>
             <s:submit method="execute" value="Login"/>
            
        </s:form>
    </body>
</html>
