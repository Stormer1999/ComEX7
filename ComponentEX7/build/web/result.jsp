<%-- 
    Document   : result
    Created on : Oct 28, 2020, 3:39:05 PM
    Author     : Storm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            result of <%=request.getParameter("num1") %>
            and <%=request.getParameter("num2")%>
            is <%=request.getAttribute("answer")%>
                    
        </h1>
    </body>
</html>
