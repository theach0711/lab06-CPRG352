<%-- 
    Document   : shoppingList
    Created on : Oct 24, 2021, 11:14:26 PM
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
        <p>Hello,${username}</p>
        <p><a href="shoppingList?action=logout">Logout</a></p>
        <h2>List</h2>
        <form method="POST "action="" >
            <label>Add item: </label>
            <input type="text" name="addItem">
            <input type="submit" value="Add">
            <input type="hidden" name="action" value="add">
        </form> 

        <form method="POST" action="" >
            <c:forEach var ='item' items="${List}">
                <c:if test="${item != null}">
                    <input type="radio" name="item_group" value="${item}"> ${item}
                    <br>
                </c:if>
            </c:forEach>
                    
            <input type="submit" value="Delete" >
            <input type="hidden" name="action" value="delete">
        </form>
    </body>
</html>
