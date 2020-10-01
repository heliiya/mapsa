package ir.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class HttpMethodApiFactory {

    private static Map<String,HttpMethodApi> actionMap = new HashMap<>();

    static {
        actionMap.put("GET/application/users", new UserGetMethodApi());
        actionMap.put("POST/application/user", new UserPostMethodApi());
        actionMap.put("GET/notFound", new NotFoundHttpMethodApi());
        // todo put & delete & patch
    }

    public synchronized HttpMethodApi getHttpMethodApi(HttpServletRequest request){
        String path = request.getServletPath() + request.getPathInfo();
        String key = request.getMethod() + path;
        // todo log
        HttpMethodApi httpMethodApi = actionMap.get(key);
        if(httpMethodApi == null){
            httpMethodApi = actionMap.get("GET/notFound");
        }
        return httpMethodApi;
    }
}
