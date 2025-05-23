package com.portifolio.logindemo.config.interceptors;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.portifolio.logindemo.util.CookieUtil;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		
		if(CookieUtil.getCookie(request, "userId") != null) {
			return true;
		}
		
		response.sendRedirect("/login");
		return false;
	}
}
