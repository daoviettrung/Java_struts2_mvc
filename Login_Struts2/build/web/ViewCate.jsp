<%-- 
    Document   : ViewCate
    Created on : May 14, 2020, 8:49:12 PM
    Author     : ADMIN//chắc ông thiếu dâu r code chạy dk àm TÔI trc cũng mày mò ra đây đc nhưng nó lại view ra trang viewcourse chạy vào index.jp
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
        <table Border="1" width="60%" align="centter">
            <tr> 
                <td>ID</td>
                <td>Name</td>
                <td>Description</td>     
                <td>sửa</td>
                <td>xóa</td>
            </tr>
            <s:iterator var="s" value="itemts">
                <tr>
                    <td><s:property value="#s.id"/></td>
                    <td><s:property value="#s.name"/></td>
                    <td><s:property value="#s.des"/></td>
                   
                    <td ><a href="editc?id=<s:property value="#s.id"/>">Edit</a></td>
                    <td ><a href="deletec?id=<s:property value="#s.id"/>">Delete</a></td>
                </tr>
            </s:iterator>
              
        </table>
    </body>
</html>
