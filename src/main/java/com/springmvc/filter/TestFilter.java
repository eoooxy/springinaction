package com.springmvc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/16
 * Time  16:42
 */

public class TestFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        //获取请求路径
        String path = req.getRequestURI();
        //获取session中作为判断的字段
        String pwd = (String) session.getAttribute("passwd");
        System.out.println(pwd);
        //判断请求的 路径中是否包含了 登录页面的请求
        //如果包含了，那么不过滤 继续执行操作
        if (path.indexOf("/back/login.do") > -1 || path.indexOf("/back/isLogin.json") > -1) {
            filterChain.doFilter(req, resp);
        } else {
            //如不包含，那么就要判断 session中否有标志，如果没有标志，那么不让他看，让他去登录，反之执行操作！
            if (pwd == null || "".equals(pwd)) {
                resp.sendRedirect("/back/login.do");
            } else {
                filterChain.doFilter(req, resp);
            }
        }
    }

    public void destroy() {

    }
}
