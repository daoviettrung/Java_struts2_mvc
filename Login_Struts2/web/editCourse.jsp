<%-- 
    Document   : editCourse
    Created on : May 14, 2020, 12:01:02 PM
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
        <form action="upDate" method="post">
            <table >
                 <tr>
                    <td><label for="uname" ><b> ID</b></label></td> 
                    <s:textfield name="id" readonly="true"/>
                </tr>


                <tr>
                    <td><label for="uname"><b> Name</b></label></td> 
                    <s:textfield name="name"/>
                </tr>
                <tr>
                    <td><label for="uname"><b>Category</b></label></td>
                    <s:textfield  name="category" />
                </tr>
                <tr>
                    <td><label for="uname"><b>Topic</label> </td>
                    <s:textfield  name="topic" />
                </tr>
                <tr>
                    <td><label for="uname"><b>Start</label> </td>
                    <s:textfield  name="start" />
                </tr>
                <tr>
                    <td><label for="uname"><b>End</label> </td>
                    <s:textfield  name="end" />
                </tr>

                <tr>

                    <s:submit method="execute" value="Update"/>

                </tr>


            </table>
        </form>

    </body>
</html>
