<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Order System Login</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Login to Your Account</h1>
    
    <p><i>${message}</i></p>
    <form action="Login" method="post">
        <input type="hidden" name="action" value="login">        
        <label class="pad_top">UserId:</label>
        <input type="text" name="userId" value="${userId}" 
               required><br>
        <label class="pad_top">Password:</label>
        <input type="password" name="password" value="" 
               required><br>
        
        <label>&nbsp;</label>
        <input type="submit" value="Login" class="margin_left">
    </form>
</body>
</html>