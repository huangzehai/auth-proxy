package huangzehai.authproxy;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ContextFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        ServletRequest request;
        if (httpServletRequest.getRequestURI().startsWith("nifi-api")) {
            request = new NiFiApiRequest(httpServletRequest);
        } else {
            request = new NiFiRequest(httpServletRequest);
        }
        filterChain.doFilter(request, servletResponse);
    }
}
