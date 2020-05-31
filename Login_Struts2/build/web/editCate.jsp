<%-- 
    Document   : editCate
    Created on : May 14, 2020, 9:21:58 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="upDateC" method="post">
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
                    <s:textfield  name="des" />
                </tr>
              

                <tr>

                    <s:submit method="execute" value="Update"/>

                </tr>


            </table>
        </form>

    </body>
</html>
