<%-- 
    Document   : statistic
    Created on : Aug 20, 2019, 8:11:22 PM
    Author     : YBolshakova
--%>


<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Statistics</title>
    </head>
    <body>
        <h1>This people are happy now:</h1>
    </body>
    <ul>
        <%
            List<String> list = (List<String>) request.getAttribute("users");
            if(!list.isEmpty()){
                 for (String u : list) {
                out.println("<li>" + u + "</li>");
            }
            }else{
                out.println("<h1>" + "Sorry, we don't have any information yet" + "</h1>");
            }
           
        %>
        <div>
            <button onclick="location.href='/Questionnaire'">Back to main</button>
        </div>
    </ul>
</html>
