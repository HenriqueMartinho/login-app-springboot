package com.portifolio.logindemo.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.portifolio.logindemo.entities.User;
import com.portifolio.logindemo.services.UserService;
import com.portifolio.logindemo.util.CookieUtil;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String validateLogin (User user, Model model, HttpServletResponse response) {
		
		Optional <User> userOpt = userService.findByEmailAndPassword(user);
		
		if(userOpt.isPresent()) {
			
			User userInf = userOpt.get();
			
			CookieUtil.setCookie(response, "UserId", String.valueOf(userInf.getId()), 10000);
			CookieUtil.setCookie(response, "Username", String.valueOf(userInf.getName()), 10000);
			
			return "redirect:/home";
			
		}
		
		model.addAttribute("erro", "Email ou senha inválidos!");
		return "redirect:/login";
		
	}
	
	@GetMapping("/signup")
	public String signUp(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/signup")
	public String confirmSignUp(@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/signup";
		}
		
		userService.saveUser(user);
		
		return "redirect:/login";
	}
	
	@GetMapping("home")
	public String maintenance () {
		return "temporary-mainpage";
	}
}
