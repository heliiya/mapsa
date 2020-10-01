package ir.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserPostMethodApi implements HttpMethodApi{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // save user
        // todo Dispatcher to successful user.jsp
    }
}
