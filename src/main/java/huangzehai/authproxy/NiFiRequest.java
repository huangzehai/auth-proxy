package huangzehai.authproxy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class NiFiRequest extends HttpServletRequestWrapper {
    public NiFiRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getContextPath() {
        return "/nifi";
    }
}
