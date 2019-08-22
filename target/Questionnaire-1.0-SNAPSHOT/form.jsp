<%-- 
    Document   : form
    Created on : Aug 20, 2019, 8:08:43 PM
    Author     : YBolshakova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questions</title>
    </head>
    <body>
        <h1>Hello!</h1> <br>
        <h3>We want to know, are you happy now?</h3><br>
    </body>
    
    <form method="post">
        <label>Name:
            <input type="text" name="name" required placeholder="Your name"><br />
        </label>
        <br>
        <label>Lastname:
            <input type="text" name="lastname" required placeholder="Your lastname"><br />
        </label>
        <br>
        <label>Age:
            <input type="text" name="age" required placeholder="Your age"><br />
        </label>
        <br>
        <label>Are you happy?:
            <input type="text" name="happy" required placeholder="Yes/No>"<br />
        </label>
        <br>
        <button type="submit">Submit</button>
    </form>
    
</html>
