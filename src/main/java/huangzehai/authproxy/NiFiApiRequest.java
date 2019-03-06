package huangzehai.authproxy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class NiFiApiRequest extends HttpServletRequestWrapper {
    public NiFiApiRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getContextPath() {
        return "/nifi-api";
    }
}