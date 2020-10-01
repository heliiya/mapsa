package ir.mapsa.exercise.servlet;

import ir.mapsa.exercise.model.User;
import ir.mapsa.exercise.services.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registerServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        User user = new User(username, password);
        RegisterService service = new RegisterService();
        String result;
        if(service.hasUser(user)){
            response.sendRedirect("/");
            result = "You have already been registered";
        }else{
            service.addUser(user);
            result = "<html> <h2> welcome " + username + "</h2> </html>";
        }

        PrintWriter writer = response.getWriter();
        writer.println(result);
    }
}
