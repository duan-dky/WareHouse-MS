package com.jack.filter;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {
    public static final String login_page = "/pages/login.html";
    public static final String logout_page = "/pages/login.html";

    //不被拦截的页面
    private static ArrayList<String> initPages = new ArrayList<>();

    static {
        initPages.add("/pages/login.html");
    }

    /**
     * Default constructor.
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String currentURL = request.getRequestURI();
        String ctxPath = request.getContextPath();
        // 除掉项目名称时访问页面当前路径
        String targetURL = currentURL.substring(ctxPath.length());
        HttpSession session = request.getSession(false);
        //判断是否为 不被拦截的界面
        Boolean isInitPage = false;
        for (int i = 0; i < initPages.size(); i++) {
            String initPage = initPages.get(i);
            System.out.print("\ninitPage:  " + initPage);
            if (initPage.equals(targetURL)) {
                isInitPage = true;
            }
        }

        if (!isInitPage) {
            System.out.println(
                    "\ntargetURL:   " + targetURL + "\nctxPath:   " + ctxPath + "\ncurrentURL:   " + currentURL);
            // 在不为登陆页面时，再进行判断，如果不是登陆页面也没有session则跳转到登录页面，
            if (session == null || session.getAttribute("user") == null) {
                response.sendRedirect("/pages/login.html");
                return;
            } else {
                // 这里表示正确，会去寻找下一个链，如果不存在，则进行正常的页面跳转
                chain.doFilter(request, response);
                return;
            }
        } else {
            chain.doFilter(request, response);
            return;
        }


    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}