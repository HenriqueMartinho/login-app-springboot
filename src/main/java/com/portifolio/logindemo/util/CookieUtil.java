package com.portifolio.logindemo.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Optional;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtil {

	public static void setCookie(HttpServletResponse response, String key, String value, int seconds) {
		try {
			Cookie cookie = new Cookie(key, URLEncoder.encode(value, "UTF-8"));
			cookie.setMaxAge(seconds);
			cookie.setPath("/");
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static String getCookie(HttpServletRequest request, String key) {

		String value = Optional.ofNullable(request.getCookies())
				.flatMap(cookies -> Arrays.stream(cookies)
				.filter(cookie -> key.equals(cookie.getName()))
				.findFirst()
				).map(cookie -> cookie.getValue())
				.orElse(null);
		
		if(value != null) {
			try {
				value = URLDecoder.decode(value, "UTF-8");
				return value;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		return value;
		
	}
}
