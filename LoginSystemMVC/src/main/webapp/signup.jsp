<!DOCTYPE html>

<html>

<head>

    <title>Signup Page</title>

</head>

<body>

<h1>Signup</h1>

<form action="SignupServlet" method="post">

    <label for="username">Username:</label>

    <input type="text" id="username" name="username" required><br>


    <label for="password">Password:</label>

    <input type="password" id="password" name="password" required><br>


    <input type="submit" value="Signup">

</form>

<p>Already have an account? <a href="login.jsp">Login</a></p>

</body>

</html>