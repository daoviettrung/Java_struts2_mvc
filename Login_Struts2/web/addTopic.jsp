<%-- 
    Document   : addTopic
    Created on : May 24, 2020, 9:43:53 AM
    Author     : ADMIN
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="addnewtopic" method="post">
                                                <table>
                                                <s:textfield label="Course ID" name="id"/>
                                                <s:textfield label="Course Name" name="name"/>
                                                <s:textfield label="Course Category" name="category"/>
                                                <s:textfield label="Course Topic" name="topic"/>
                                                <s:textfield label="Course trainer" name="trainer"/>
                                                <s:textfield label="Course start" name="start"/>
                                                <s:textfield label="Course end" name="end"/>
                                                <s:textfield label="Course location" name="location"/>
                                                <s:textfield label="Course description" name="description"/>
                                                
                                                <s:submit method="addAction" value="Add Course"/>
                                              
                                                </table>
                                               
                                            </s:form>
    </body>
</html>
