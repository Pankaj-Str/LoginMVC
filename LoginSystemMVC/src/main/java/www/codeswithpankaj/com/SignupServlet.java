package www.codeswithpankaj.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        String username = request.getParameter("username");

        String password = request.getParameter("password");


        User newUser = new User(username, password);

        UserRepository.addUser(newUser);


        response.setContentType("text/html");

        //response.getWriter().println("<h1>Signup Successful!</h1>");
        response.sendRedirect("login.jsp");

    }

}