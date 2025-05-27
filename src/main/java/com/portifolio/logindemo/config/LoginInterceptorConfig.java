package com.portifolio.logindemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.portifolio.logindemo.config.interceptors.LoginInterceptor;

@Configuration
public class LoginInterceptorConfig implements WebMvcConfigurer {
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor).excludePathPatterns(
				"/login",
				"/signup",
				"/error",
				"/css/style.css",
				"/users",
				"/users/*");
	}

}
