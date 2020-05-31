<%-- 
    Document   : addTrainee
    Created on : May 20, 2020, 10:15:39 AM
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
        <form action="addMidTopic" method="post">
            <table >
                 <tr>
                    <td><label for="uname" ><b> ID Topic</b></label></td> 
                    <s:textfield name="topicid"/>
                </tr>


                <tr>
                    <td><label for="uname"><b>ID Trainer </b></label></td> 
                    <s:textfield name="trainerid" />
                </tr>
              

                <tr>

                     <s:submit  value="Add Mid Topic"/>

                </tr>


            </table>
        </form>
                     <a href=" ViewMidCourse">View</a>
    </body>
</html>
