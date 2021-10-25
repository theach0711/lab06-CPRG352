<%-- 
    Document   : register
    Created on : Oct 24, 2021, 11:14:01 PM
    Author     : 847240
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method ="POST" action="shoppingList">
            <label>Username:</label>
            <input type="text" name="username">
            <input type="hidden" name="action" value="registerName">
            <input type ="submit" value ="Register name">
            
        </form>
    </body>
</html>
