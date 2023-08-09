<!DOCTYPE html>

<html>

<head>

  <title>Login Page</title>

</head>

<body>

<h1>Login</h1>

<form action="LoginServlet" method="post">

  <label for="username">Username:</label>

  <input type="text" id="username" name="username" required><br>


  <label for="password">Password:</label>

  <input type="password" id="password" name="password" required><br>


  <input type="submit" value="Login">

</form>

<p>Don't have an account? <a href="signup.jsp">Signup</a></p>

</body>

</html>