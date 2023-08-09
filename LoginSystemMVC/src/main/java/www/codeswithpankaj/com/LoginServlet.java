package www.codeswithpankaj.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        String username = request.getParameter("username");

        String password = request.getParameter("password");


        User user = UserRepository.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {

            response.setContentType("text/html");

            response.getWriter().println("<h1>Login Successful!</h1>");

        } else {

            response.setContentType("text/html");

            response.getWriter().println("<h1>Login Failed. Invalid username or password.</h1>");

        }

    }

}