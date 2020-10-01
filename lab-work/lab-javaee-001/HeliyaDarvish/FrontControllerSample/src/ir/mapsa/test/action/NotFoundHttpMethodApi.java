package ir.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NotFoundHttpMethodApi implements HttpMethodApi{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendRedirect(request.getContextPath() + "/notFound.html");
    }
}
