<%-- 
    Document   : viewSearch
    Created on : May 15, 2020, 10:46:48 AM
    Author     : ADMIN
--%>
<%@taglib prefix="p" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form>
                                                <table Border="1" width="60%" align="centter">
                                                    <tr> 
                                                        <td>ID Course</td>
                                                        <td>ID Trainee</td>
                                                        
                                                        <th>Edit</th>
                                                        <th>Delete</th>



                                                    </tr>
                                                    <p:iterator var="p" value="searchMidCourse">
                                                        <tr>
                                                            <td><p:property value="#p.id"/></td>
                                                            <td><p:property value="#p.idTrainee"/></td>
                                                           
                                                            <td ><a href="edit?id=<p:property value="#p.id"/>">Edit</a></td>
                                                            <td ><a href="delete?id=<p:property value="#p.id"/>">Delete</a></td>
                                                        </tr>
                                                    </p:iterator>
                                                </table>



                                                <a href=addCourse.jsp>Thêm Mới</a>


                                            </form>
    </body>
</html>
