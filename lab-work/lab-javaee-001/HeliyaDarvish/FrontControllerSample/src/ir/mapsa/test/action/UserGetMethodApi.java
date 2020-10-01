package ir.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserGetMethodApi implements HttpMethodApi {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // create response list user
        request.getRequestDispatcher(request.getServletContext().getContextPath()
                + "/application/user.jsp").forward(request, response);
    }
}
