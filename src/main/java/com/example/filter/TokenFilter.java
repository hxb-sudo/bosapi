package com.example.filter;

import com.example.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TokenFilter implements Filter {

    @Autowired
    private Helper helper;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        // 如果是登录请求和OPTIONS请求则正常通过
        if ("/user/login".equals(uri) || request.getMethod().equalsIgnoreCase("OPTIONS")) {
            filterChain.doFilter(request,response);
        }else {
            String token = request.getHeader("X-Token");// 获取请求头中的token
            int i = -1;
            if (token != null) i = helper.CheckedRequest(request); // 验证是否获取到token，会话是否存在
            if (i == 20000) {
                filterChain.doFilter(request,response);
            }else if (i == 500) {
                request.getRequestDispatcher("/error/fiveHundred").forward(request,response);
            }else {
                request.getRequestDispatcher("/error/minusOne").forward(request,response);
            }
        }
    }
}
