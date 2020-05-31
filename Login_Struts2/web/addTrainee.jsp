<%-- 
    Document   : addTrainee
    Created on : May 20, 2020, 10:15:39 AM
    Author     : ADMIN
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addMidTrainee" method="post">
            <table >
                 <tr>
                    <td><label for="uname" ><b> ID Course</b></label></td> 
                    <s:textfield name="id"/>
                </tr>


                <tr>
                    <td><label for="uname"><b>ID Trainee</b></label></td> 
                    <s:textfield name="idTrainee" />
                </tr>
              

                <tr>

                     <s:submit  value="Add Mid Course"/>

                </tr>


            </table>
        </form>
                     <a href=" ViewMidCourse">View</a>
                     
                     
                     
                     
                        <p:form action="searchMidCourse" method="post">
                                    <p:textfield name="id" />
                                    <p:submit method="searchAction" value="Search"/>
                                </p:form>
                       <form>
                                                <table Border="1" width="60%" align="centter">
                                                    <tr> 
                                                        <td>ID course</td>
                                                        <td>ID trainee</td>




                                                    </tr>
                                                    <p:iterator var="p" value="midCourse">
                                                        <tr>
                                                            <td><p:property value="#p.id"/></td>
                                                            <td><p:property value="#p.idTrainee"/></td>
                                                            <td ><a href="editTraineeInCourse?id=<p:property value="#p.id"/>">Edit</a></td>
                                                            <td ><a href="deleteTraineeInCourse?id=<p:property value="#p.id"/>">Delete</a></td>
                                                        </tr>
                                                    </p:iterator>
                                                </table>



                                                <a href="addTrainee.jsp">Add</a>


                                            </form>
    </body>
</html>
