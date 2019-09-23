package com.my.blog.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "SigninFilter")
public class SigninFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("[SigninFilter] doFiter()");
        HttpSession session = ((HttpServletRequest)req).getSession();
        if(session == null || session.getAttribute("authUser")== null){
            ((HttpServletResponse)resp).sendRedirect(((HttpServletRequest) req).getContextPath()+"/signin.do");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
