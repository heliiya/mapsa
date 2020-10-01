package ir.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HttpMethodApi {
    void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
